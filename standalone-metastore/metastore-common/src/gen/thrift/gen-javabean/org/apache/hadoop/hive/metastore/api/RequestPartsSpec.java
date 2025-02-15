/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class RequestPartsSpec extends org.apache.thrift.TUnion<RequestPartsSpec, RequestPartsSpec._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RequestPartsSpec");
  private static final org.apache.thrift.protocol.TField NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("names", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("exprs", org.apache.thrift.protocol.TType.LIST, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAMES((short)1, "names"),
    EXPRS((short)2, "exprs");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAMES
          return NAMES;
        case 2: // EXPRS
          return EXPRS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAMES, new org.apache.thrift.meta_data.FieldMetaData("names", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EXPRS, new org.apache.thrift.meta_data.FieldMetaData("exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DropPartitionsExpr.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RequestPartsSpec.class, metaDataMap);
  }

  public RequestPartsSpec() {
    super();
  }

  public RequestPartsSpec(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public RequestPartsSpec(RequestPartsSpec other) {
    super(other);
  }
  public RequestPartsSpec deepCopy() {
    return new RequestPartsSpec(this);
  }

  public static RequestPartsSpec names(java.util.List<java.lang.String> value) {
    RequestPartsSpec x = new RequestPartsSpec();
    x.setNames(value);
    return x;
  }

  public static RequestPartsSpec exprs(java.util.List<DropPartitionsExpr> value) {
    RequestPartsSpec x = new RequestPartsSpec();
    x.setExprs(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case NAMES:
        if (value instanceof java.util.List) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.util.List<java.lang.String> for field 'names', but got " + value.getClass().getSimpleName());
      case EXPRS:
        if (value instanceof java.util.List) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.util.List<DropPartitionsExpr> for field 'exprs', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case NAMES:
          if (field.type == NAMES_FIELD_DESC.type) {
            java.util.List<java.lang.String> names;
            {
              org.apache.thrift.protocol.TList _list620 = iprot.readListBegin();
              names = new java.util.ArrayList<java.lang.String>(_list620.size);
              @org.apache.thrift.annotation.Nullable java.lang.String _elem621;
              for (int _i622 = 0; _i622 < _list620.size; ++_i622)
              {
                _elem621 = iprot.readString();
                names.add(_elem621);
              }
              iprot.readListEnd();
            }
            return names;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case EXPRS:
          if (field.type == EXPRS_FIELD_DESC.type) {
            java.util.List<DropPartitionsExpr> exprs;
            {
              org.apache.thrift.protocol.TList _list623 = iprot.readListBegin();
              exprs = new java.util.ArrayList<DropPartitionsExpr>(_list623.size);
              @org.apache.thrift.annotation.Nullable DropPartitionsExpr _elem624;
              for (int _i625 = 0; _i625 < _list623.size; ++_i625)
              {
                _elem624 = new DropPartitionsExpr();
                _elem624.read(iprot);
                exprs.add(_elem624);
              }
              iprot.readListEnd();
            }
            return exprs;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case NAMES:
        java.util.List<java.lang.String> names = (java.util.List<java.lang.String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, names.size()));
          for (java.lang.String _iter626 : names)
          {
            oprot.writeString(_iter626);
          }
          oprot.writeListEnd();
        }
        return;
      case EXPRS:
        java.util.List<DropPartitionsExpr> exprs = (java.util.List<DropPartitionsExpr>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, exprs.size()));
          for (DropPartitionsExpr _iter627 : exprs)
          {
            _iter627.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case NAMES:
          java.util.List<java.lang.String> names;
          {
            org.apache.thrift.protocol.TList _list628 = iprot.readListBegin();
            names = new java.util.ArrayList<java.lang.String>(_list628.size);
            @org.apache.thrift.annotation.Nullable java.lang.String _elem629;
            for (int _i630 = 0; _i630 < _list628.size; ++_i630)
            {
              _elem629 = iprot.readString();
              names.add(_elem629);
            }
            iprot.readListEnd();
          }
          return names;
        case EXPRS:
          java.util.List<DropPartitionsExpr> exprs;
          {
            org.apache.thrift.protocol.TList _list631 = iprot.readListBegin();
            exprs = new java.util.ArrayList<DropPartitionsExpr>(_list631.size);
            @org.apache.thrift.annotation.Nullable DropPartitionsExpr _elem632;
            for (int _i633 = 0; _i633 < _list631.size; ++_i633)
            {
              _elem632 = new DropPartitionsExpr();
              _elem632.read(iprot);
              exprs.add(_elem632);
            }
            iprot.readListEnd();
          }
          return exprs;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case NAMES:
        java.util.List<java.lang.String> names = (java.util.List<java.lang.String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, names.size()));
          for (java.lang.String _iter634 : names)
          {
            oprot.writeString(_iter634);
          }
          oprot.writeListEnd();
        }
        return;
      case EXPRS:
        java.util.List<DropPartitionsExpr> exprs = (java.util.List<DropPartitionsExpr>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, exprs.size()));
          for (DropPartitionsExpr _iter635 : exprs)
          {
            _iter635.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case NAMES:
        return NAMES_FIELD_DESC;
      case EXPRS:
        return EXPRS_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public java.util.List<java.lang.String> getNames() {
    if (getSetField() == _Fields.NAMES) {
      return (java.util.List<java.lang.String>)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'names' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setNames(java.util.List<java.lang.String> value) {
    setField_ = _Fields.NAMES;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.NAMES");
  }

  public java.util.List<DropPartitionsExpr> getExprs() {
    if (getSetField() == _Fields.EXPRS) {
      return (java.util.List<DropPartitionsExpr>)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'exprs' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setExprs(java.util.List<DropPartitionsExpr> value) {
    setField_ = _Fields.EXPRS;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.EXPRS");
  }

  public boolean isSetNames() {
    return setField_ == _Fields.NAMES;
  }


  public boolean isSetExprs() {
    return setField_ == _Fields.EXPRS;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof RequestPartsSpec) {
      return equals((RequestPartsSpec)other);
    } else {
      return false;
    }
  }

  public boolean equals(RequestPartsSpec other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(RequestPartsSpec other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
