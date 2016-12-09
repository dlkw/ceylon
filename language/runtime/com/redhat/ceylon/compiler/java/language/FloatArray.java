package com.redhat.ceylon.compiler.java.language;

import javax.annotation.Generated;

import ceylon.language.Array;

import com.redhat.ceylon.compiler.java.Util;
import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.Class;
import com.redhat.ceylon.compiler.java.metadata.Defaulted;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.ValueType;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;

import ceylon.language.AssertionError;
import ceylon.language.Callable;
import ceylon.language.Category$impl;
import ceylon.language.Comparison;
import ceylon.language.Entry;
import ceylon.language.Finished;
import ceylon.language.Iterable;
import ceylon.language.Iterable$impl;
import ceylon.language.Iterator;
import ceylon.language.List;
import ceylon.language.Null;
import ceylon.language.Sequential;
import ceylon.language.empty_;
import ceylon.language.finished_;
import ceylon.language.impl.BaseIterable;

/*
 * THIS IS A GENERATED FILE - DO NOT EDIT 
 */
/**
 * A type representing Java primitive arrays of type 
 * {@code float[]}.
 *
 * @author Stéphane Épardaud <stef@epardaud.fr>
 */
/*
 * THIS IS A GENERATED FILE - DO NOT EDIT 
 */
//This type is never actually instantiated, it is always
//replaced by the Java object array type float[].
//
//The operations which call 
//Util.makeJavaArrayWrapperException() are completely 
//erased to Java array operators, or Util.fillArray() 
//in the case of the constructor if the initial element is 
//specified.
//
//Only the value type static methods are really invoked.
@Ceylon(major = 8)
@Class(constructors=true)
@ValueType
@Generated(value="ant")
public final class FloatArray implements ReifiedType {
    
    @Ignore
    public final static TypeDescriptor $TypeDescriptor$ = 
    TypeDescriptor.klass(FloatArray.class);
    
    /**
     * Create a new array of the given {@code size}, with
     * all elements initialized to the given {@code element}.
     * 
     * @throws NegativeArraySizeException if {@code size}
     *         is negative
     * @param size the size of the array
     * @param element the initial value of the array elements
     */
    public FloatArray(
            /**
             * The size of the new array.
             */
            @Name("size") int size, 
            /**
             * The initial value of the array elements.
             */
            @TypeInfo("ceylon.language::Float") 
            @Defaulted @Name("element") 
            float element){
        throw Util.makeJavaArrayWrapperException();
    }

    /**
     * Create a new array of the given {@code size}, with
     * all elements initialized to {@code null}.
     * 
     * @throws NegativeArraySizeException if {@code size}
     *         is negative
     * @param size the size of the array
     */
    @Ignore
    public FloatArray(
            /**
             * The size of the new array.
             */
            @Name("size") int size){
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    // For consistency with the rules for ValueTypes
    public static FloatArray instance(float[] value){
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    public final static with_ with_ = null;
    
    @Ignore
    @com.redhat.ceylon.compiler.java.metadata.ConstructorName("with")
    public static final class with_ {
        private with_() {}
    };
    
    @ceylon.language.SharedAnnotation$annotation$
    @com.redhat.ceylon.compiler.java.metadata.Name("with")
    public FloatArray(
            @Ignore
            with_ $name$,
            @com.redhat.ceylon.common.NonNull
            @Name("elements")
            @TypeInfo("{ceylon.language::Float*}")
            final Iterable<? extends ceylon.language.Float, ? extends java.lang.Object> elements$param$) {
        throw Util.makeJavaArrayWrapperException();
    }

    /**
     * Get the element with the given {@code index}.
     * 
     * @param index the index within this array
     * @return the element of this array at the given 
     *         {@code index}
     * @throws ArrayIndexOutOfBoundsException if the index
     *         does not refer to an element of this array
     */
    public float get(@Name("index") int index) {
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public static float get(float[] value, int index) {
        throw Util.makeJavaArrayWrapperException();
    }

    /**
     * Set the element with the given {@code index} to the
     * given {@code element} value.
     * 
     * @param index the index within this array
     * @param element the new element value
     * @throws ArrayIndexOutOfBoundsException if the index
     *         does not refer to an element of this array
     * @throws ArrayStoreException if the given element can
     *         not be stored in the array. 
     */
    public void set(
            /**
             * The index within the array.
             */
            @Name("index") 
            int index, 
            /**
             * The new value of the array element.
             */
            @Name("element") 
            float element) {
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public static void set(float[] value, int index, 
            float element) {
        throw Util.makeJavaArrayWrapperException();
    }
    
    /**
     * The size of this Java primitive array.
     */
    @Name("size")
    public final int length = 0;

    /**
     * A view of this array as a Ceylon
     * {@code Array<java.lang::Float>}, where
     * {@code java.lang::Float} is the Java wrapper type
     * corresponding to the primitive type
     * {@code float} of elements of this Java
     * array.
     */
    @TypeInfo("ceylon.language::Array<java.lang::Float>")
    public ceylon.language.Array<java.lang.Float> getArray(){
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    public static ceylon.language.Array<java.lang.Float> 
    getArray(float[] array){
        return Array.instance(array);
    }

    ///**
    // * A view of this array as a Ceylon
    // * {@code Array<NOT USED>}
    // * where {@code NOT USED}
    // * is the Ceylon type corresponding to the
    // * primitive type {@code float}
    // * of elements of this Java array.
    // */
    /*@TypeInfo("ceylon.language::Array<NOT USED>")
    public ceylon.language.Array<NOT USED> 
    NOT USED(){
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    public static ceylon.language.Array<NOT USED> 
    NOT USED(float[] array){
        return Array.NOT USED(array);
    }*/
    
    /**
     * Efficiently copy a measure of this Java primitive 
     * array to the given Java primitive array.
     * 
     * @param destination the array into which to copy the
     *        elements of this array
     * @param sourcePosition the starting position within
     *        this array
     * @param destinationPosition the starting position 
     *        within the {@code destination} array
     * @param length the number of elements to copy
     */
    public void copyTo(@Name("destination") float[] destination, 
                       @Name("sourcePosition") @Defaulted int sourcePosition, 
                       @Name("destinationPosition") @Defaulted int destinationPosition, 
                       @Name("length") @Defaulted int length){
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    public static void copyTo(float[] array, 
            float[] destination){
        System.arraycopy(array, 0, destination, 0, array.length);
    }

    @Ignore
    public static void copyTo(float[] array, 
            float[] destination, 
            int sourcePosition){
        System.arraycopy(array, sourcePosition, destination, 
                0, array.length-sourcePosition);
    }

    @Ignore
    public static void copyTo(float[] array, 
            float[] destination, 
            int sourcePosition, int destinationPosition){
        System.arraycopy(array, sourcePosition, destination, 
                destinationPosition, array.length-sourcePosition);
    }

    @Ignore
    public static void copyTo(float[] array, 
            float[] destination, 
            int sourcePosition, int destinationPosition, 
            int length){
        System.arraycopy(array, sourcePosition, destination, 
                destinationPosition, length);
    }

    @Ignore
    public int copyTo$sourcePosition(float[] destination){
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public int copyTo$destinationPosition(float[] destination, 
            int sourcePosition){
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public int copyTo$length(float[] destination, 
            int sourcePosition, int destinationPosition){
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public void copyTo(float[] destination){
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public void copyTo(float[] destination, 
                       int sourcePosition){
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public void copyTo(float[] destination, 
                       int sourcePosition, 
                       int destinationPosition){
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    @Override
    public TypeDescriptor $getType$() {
        throw Util.makeJavaArrayWrapperException();
    }

    @Override
    public boolean equals(@Name("that") java.lang.Object that) {
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public static boolean equals(float[] value, 
            java.lang.Object that) {
        return value.equals(that);
    }

    @Override
    public int hashCode() {
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public static int hashCode(float[] value) {
        return value.hashCode();
    }

    @Override
    public java.lang.String toString() {
        throw Util.makeJavaArrayWrapperException();
    }

    @Ignore
    public static java.lang.String toString(float[] value) {
        return value.toString();
    }
    
    /**
     * A clone of this primitive Java array.
     */
    public float[] $clone() {
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    public static float[] $clone(float[] value) {
        return value.clone();
    }
    
    /**
     * A Ceylon {@code Iterable<ceylon.language.Float>} containing the 
     * elements of this primitive Java array.
     */
    @TypeInfo("{ceylon.language::Float*}")
    public ceylon.language.Iterable<ceylon.language.Float,ceylon.language.Null> getIterable() {
        throw Util.makeJavaArrayWrapperException();
    }
    
    @Ignore
    public static ceylon.language.Iterable<ceylon.language.Float,ceylon.language.Null> getIterable(float[] value) {
        return new FloatArrayIterable(value);
    }
}

/* Implement Iterable */
class FloatArrayIterable 
extends BaseIterable<ceylon.language.Float, ceylon.language.Null> {
    
    /** The array over which we iterate */
    private final float[] array;
    /** The index where iteration starts */
    private final int start;
    /** The step size of iteration */
    private final int step;
    /** The index one beyond where iteration ends */
    private final int end;
    
    @Ignore
    public FloatArrayIterable(float[] array) {
        this(array, 0, array.length, 1);
    }
    
    @Ignore
    private FloatArrayIterable(float[] array, 
            int start, int end, int step) {
        super(ceylon.language.Float.$TypeDescriptor$, Null.$TypeDescriptor$);
        if (start < 0) {
            throw new ceylon.language.AssertionError("start must be positive");
        }
        if (end < 0) {
            throw new ceylon.language.AssertionError("end must be positive");
        }
        if (step <= 0) {
            throw new ceylon.language.AssertionError("step size must be greater than zero");
        }
        
        this.array = array;
        this.start = start;
        this.end = end;
        this.step = step;
    }
    
    @Override
    public boolean containsAny(Iterable<? extends Object, ? extends Object> arg0) {
        Iterator<? extends Object> iter = arg0.iterator();
        Object item;
        while (!((item = iter.next()) instanceof Finished)) {
            if (item instanceof ceylon.language.Float) {
                for (int ii = this.start; ii < this.end; ii+=this.step) {
                    if (array[ii] == ((ceylon.language.Float)item).doubleValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean containsEvery(
            Iterable<? extends Object, ? extends Object> arg0) {
        Iterator<? extends Object> iter = arg0.iterator();
        Object item;
        OUTER: while (!((item = iter.next()) instanceof Finished)) {
            if (item instanceof ceylon.language.Float) {
                for (int ii = this.start; ii < this.end; ii+=this.step) {
                    if (array[ii] == ((ceylon.language.Float)item).doubleValue()) {
                        continue OUTER;
                    }
                }
            } 
            return false;
        }
        return true;
    }
    
    @Override
    public boolean any(Callable<? extends ceylon.language.Boolean> arg0) {
        for (int ii=this.start; ii < this.end; ii+=this.step) {
            if (arg0.$call$(ceylon.language.Float.instance(array[ii])).booleanValue()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean contains(Object item) {
        for (int ii = this.start; ii < this.end; ii+=this.step) {
            if (item instanceof ceylon.language.Float 
                    && array[ii] == ((ceylon.language.Float)item).doubleValue()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public <Default> Iterable<? extends Object, ? extends Null> defaultNullElements(
            @Ignore
            TypeDescriptor $reified$Default, 
            Default defaultValue) {
        return this;
    }
    
    @Override
    public Iterable<? extends ceylon.language.Float, ? extends Object> getCoalesced() {
        return this;
    }
    
    @Override
    public boolean getEmpty() {
        return this.end <= this.start;
    }
    
    @Override
    public long getSize() {
        return java.lang.Math.max(0, (this.end-this.start+this.step-1)/this.step);
    }
    
    @Override
    public ceylon.language.Float getFirst() {
        return this.getEmpty() ? null : ceylon.language.Float.instance(this.array[this.start]);
    }
    
    
    @Override
    public ceylon.language.Float getLast() {
        return this.getEmpty() ? null : ceylon.language.Float.instance(this.array[this.end-1]);
    }
    
    @Override
    public FloatArrayIterable getRest() {
        return new FloatArrayIterable(this.array, this.start+1, this.end, this.step);
    }
    
    @Override
    public Sequential<? extends ceylon.language.Float> sequence() {
        // Note: Sequential is immutable, and we don't know where the array
        // came from, so however we create the sequence we must take a copy
        //TODO: use a more efficient imple, like in List.sequence()
        return super.sequence();
    }
    
    @Override
    public Iterator<? extends ceylon.language.Float> iterator() {
        if (this.getEmpty()) {
            return (Iterator)ceylon.language.emptyIterator_.get_();
        }
        return new Iterator<ceylon.language.Float>() {
            
            private int index = FloatArrayIterable.this.start;
            
            @Override
            public Object next() {
                if (index < FloatArrayIterable.this.end) {
                    ceylon.language.Float result = ceylon.language.Float.instance(FloatArrayIterable.this.array[index]);
                    index += FloatArrayIterable.this.step;
                    return result;
                } else {
                    return finished_.get_();
                }
            }
        };
    }
    
    @Override
    public boolean longerThan(long length) {
        return this.getSize() > length;
    }
    
    @Override
    public boolean shorterThan(long length) {
        return this.getSize() < length;
    }
    
    @Override
    public FloatArrayIterable by(long step) {
        return new FloatArrayIterable(this.array, 
                this.start, 
                this.end, 
                com.redhat.ceylon.compiler.java.Util.toInt(this.step*step));
    }
    
    @Override
    public FloatArrayIterable skip(long skip) {
        if (skip <= 0) {
            return this;
        }
        return new FloatArrayIterable(this.array, 
                com.redhat.ceylon.compiler.java.Util.toInt(this.start+skip*this.step), 
                this.end, 
                this.step);
    }
    
    @Override
    public FloatArrayIterable take(long take) {
        if (take >= this.getSize()) {
            return this;
        }
        return new FloatArrayIterable(this.array, 
                this.start, 
                com.redhat.ceylon.compiler.java.Util.toInt(this.start+take*this.step), 
                this.step);
    }
    
}
