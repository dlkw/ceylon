function(t,$mpt){
  if (t.supertypeOf(this))return this;
  var _t={t:'i',l:this.tipo.l.slice(0)};
  _t.l.push(t.$a$.Target$Type);
  return AppliedIntersectionType$jsint(_t,this.satisfiedTypes.sequence().withTrailing(t,{Other$withTrailing:t.$a$.Target$Type}),
    {Union$AppliedIntersectionType:_t});
}
