
"A range of totally ordered, ordinal values generated by two 
 endpoints which are both [[Ordinal]] and [[Comparable]]: 
 [[first]] and [[last]].
 
 - If `first<last` the range is increasing,
 - if `first>last`, the range is decreasing, or
 - otherwise, if `first==last`, the range contains exactly
   one value.
 
 A range is always nonempty, containing at least one value.
 
 A range is a [[Sequence]].
 
 The _span_ operator `..` is an abbreviation for `Range`
 instantiation.
 
     for (i in min..max) { ... }
     if (char in 'A'..'Z') { ... }
 
 See the documentation for [[Ordinal]] for more
 information about the span and segment operators."
by ("Gavin")
see (`interface Enumerable`)
shared final class Range<Element>(first, last) 
        extends Object() 
        satisfies [Element+]
        given Element satisfies Enumerable<Element> { 
    
    "The start of the range."
    shared actual Element first;
    
    "The end of the range."
    shared actual Element last;
    
    shared actual String string 
            => first.string + ".." + last.string;
    
    "Determines if the range is increasing, that is, if
     successors occur after predecessors."
    shared Boolean increasing 
            = last.offsetSign(first)>=0;
    
    "Determines if the range is decreasing, that is, if
     predecessors occur after successors."
    shared Boolean decreasing => !increasing;
    
    "Determines if the range is of rescursive values, that 
     is, if successors wrap back on themselves."
    Boolean recursive 
            => first.offsetSign(first.successor)>=0;
    
    Element next(Element x) 
            => increasing then x.successor 
                          else x.predecessor;
    
    Element nextStep(Element x, Integer step) 
            => increasing then x.neighbour(step) 
                          else x.neighbour(-step);
    
    Element fromFirst(Integer offset)
            => increasing then first.neighbour(offset)
                          else first.neighbour(-offset);
    
    Boolean afterLast(Element x)
            => increasing then x.offsetSign(last)>0
                          else x.offsetSign(last)<0;
    
    Boolean beforeLast(Element x)
            => increasing then x.offsetSign(last)<0
                          else x.offsetSign(last)>0;
    
    Boolean beforeFirst(Element x)
            => increasing then x.offsetSign(first)<0
                          else x.offsetSign(first)>0;
    
    Boolean afterFirst(Element x)
            => increasing then x.offsetSign(first)>0
                          else x.offsetSign(first)<0;
    
    "The nonzero number of elements in the range."
    shared actual Integer size 
            => last.offset(first).magnitude+1;
    
    shared actual Boolean longerThan(Integer length) {
        if (length<1) {
            return true;
        }
        else if (recursive) {
            return size>length;
        }
        else {
            return beforeLast(fromFirst(length-1));
        }
    }
    
    shared actual Boolean shorterThan(Integer length) {
        if (length<1) {
            return true;
        }
        else if (recursive) {
            return size<length;
        }
        else {
            return afterLast(fromFirst(length-1));
        }
    }
    
    "The index of the end of the range."
    shared actual Integer lastIndex => size-1; 
    
    "The rest of the range, without the start of the range."
    shared actual Element[] rest 
            => first==last then [] else next(first)..last;
    
    "This range in reverse, with [[first]] and [[last]]
     interchanged.
     
     For any two range endpoints, `x` and `y`: 
     
         `(x..y).reversed == y..x`."
    shared actual Range<Element> reversed => last..first;
    
    "The element of the range that occurs [[index]] values 
     after the start of the range. Note that this operation 
     may be inefficient for large ranges."
    shared actual Element? getFromFirst(Integer index) {
        if (index<0) {
            return null;
        }
        else if (recursive) {
            return index<size then fromFirst(index);
        }
        else {
            value result = fromFirst(index);
            return !afterLast(result) then result;
        }
    }
    
    "An iterator for the elements of the range."
    shared actual Iterator<Element> iterator() {
        if (recursive) {
            object iterator
                    satisfies Iterator<Element> {
                variable value count = 0;
                variable value current = first;
                shared actual Element|Finished next() {
                    if (++count>size) {
                        return finished;
                    }
                    else {
                        return current++;
                    } 
                }
                string => outer.string + ".iterator()";
            }
            return iterator;
        }
        else {
            object iterator 
                    satisfies Iterator<Element> {
                variable value current = first;
                shared actual Element|Finished next() {
                    if (containsElement(current)) {
                        value result = current;
                        current = outer.next(current);
                        return result;
                    }
                    else {
                        return finished;
                    }
                }
                string => outer.string + ".iterator()";
            }
            return iterator;
        }
    }
    
    shared actual {Element+} by(Integer step) {
        "step size must be greater than zero"
        assert (step > 0);
        return step == 1 then this else By(step);
    }
    
    "Returns a range of the same length and type as this
     range, with its endpoints shifted by the given number 
     of elements, where:
     
     - a negative [[shift]] measures 
       [[decrements|Ordinal.predecessor]], and 
     - a positive `shift` measures 
       [[increments|Ordinal.successor]]."
    shared Range<Element> shifted(Integer shift) {
        if (shift==0) {
            return this;
        }
        else {
            value start = first.neighbour(shift);
            value end = last.neighbour(shift);
            return start..end;
        }
    }
    
    shared actual Integer count(Boolean selecting(Element element)) {
        variable value element = first;
        variable value count = 0;
        while (containsElement(element)) {
            if (selecting(element)) {
                count++;
            }
            element = next(element);
        }
        return count;
    }
    
    "Determines if this range includes the given object."
    shared actual Boolean contains(Object element) {
        if (is Element element) {
            return containsElement(element);
        }
        else {
            return false;
        }
    }
    
    "Determines if this range includes the given value."
    shared actual Boolean occurs(Anything element) {
        if (is Element element) {
            return containsElement(element);
        }
        else {
            return false;
        }
    }
    
    "Determines if the range includes the given value."
    shared Boolean containsElement(Element x) 
            => recursive then x.offset(first) <= last.offset(first)
                         else !afterLast(x) && !beforeFirst(x);
    
    shared actual Boolean includes(List<Anything> sublist) {
        if (sublist.empty) {
            return true;
        }
        if (is Range<Element> sublist) {
            return includesRange(sublist);
        }
        else {
            return super.includes(sublist);
            /*if (is Element start = sublist.first) {
                if (decreasing
                        then start>first || start<last
                        else start<first || start>last) {
                    return false;
                }
                variable value current=start;
                for (element in sublist) {
                    if (exists element) {
                        if (element!=current ||
                            decreasing
                                then current<last
                                else current>last) {
                            return false;
                        }
                        current = next(current);
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
             }
             else {
                return false;
             }*/
        }
    }
    
    "Determines if this range includes the given range."
    shared Boolean includesRange(Range<Element> sublist) {
        if (recursive) {
            return sublist.first.offset(first)<size &&
                    sublist.last.offset(first)<size;
        }
        else {
            return increasing == sublist.increasing &&
                    !sublist.afterFirst(first) &&
                    !sublist.beforeLast(last);
        }
    }
    
    "Determines if two ranges are the same by comparing
     their endpoints."
    shared actual Boolean equals(Object that) {
        if (is Range<Object> that) {
            //optimize for another Range
            return that.first==first && that.last==last;
        }
        else {
            //it might be another sort of List
            return super.equals(that);
        }
    }
    
    "Returns the range itself, since ranges are 
     immutable."
    shared actual Range<Element> clone() => this;
    
    "Returns the range itself, since a Range cannot
     contain nulls."
    shared actual Range<Element> coalesced => this;
    
    "Returns this range."
    shared actual Range<Element> sequence() => this;
    
    class By(Integer step) 
            satisfies {Element+} {
        
        size => 1 + (outer.size-1) / step;
        
        first => outer.first;
        
        string => "``first``..``last``.by(``step``)";
        
        shared actual Iterator<Element> iterator() {
            if (recursive) {
                object iterator
                        satisfies Iterator<Element> {
                    variable value count = 0;
                    variable value current = first;
                    shared actual Element|Finished next() {
                        if (++count>size) {
                            return finished;
                        }
                        else {
                            value result = current;
                            current = current.neighbour(step);
                            return result;
                        } 
                    }
                    string => outer.string + ".iterator()";
                }
                return iterator;
            }
            else {
                object iterator 
                        satisfies Iterator<Element> {
                    variable value current = first; 
                    shared actual Element|Finished next() {
                        if (containsElement(current)) {
                            value result = current;
                            current = nextStep(current, step);
                            return result;
                        }
                        else {
                            return finished;
                        }
                    }
                    string => outer.string + ".iterator()";
                }
                return iterator;
            }
        }
        
    }
    
    shared actual [Element*] segment(Integer from, Integer length) 
            => length<=0 then [] else span(from, from+length-1);
    
    shared actual [Element*] span(Integer from, Integer to) {
        if (from<=to) {
            if (to<0 || !longerThan(from)) {
                return [];
            }
            else {
                return (this[from] else first)..(this[to] else last);
            }
        }
        else {
            if (from<0 || !longerThan(to)) {
                return [];
            }
            else {
                return (this[from] else last)..(this[to] else first);
            }
        }
    }
    
    shared actual [Element*] spanFrom(Integer from) {
        if (from<=0) {
            return this;
        }
        else if (longerThan(from)) {
            assert (exists first = this[from]);
            return first..last;
        }
        else {
            return [];
        }
    }
    
    shared actual [Element*] spanTo(Integer to) {
        if (to<0) {
            return [];
        }
        else if (longerThan(to+1)) {
            assert (exists last = this[to]);
            return first..last;
        }
        else {
            return this;
        }
    }
    
}
