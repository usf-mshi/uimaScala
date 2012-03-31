

/* First created by JCasGen Sun Jan 22 13:52:21 CET 2012 */
package com.github.jenshaase.uimascala.examples.ex1.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Jan 22 13:52:21 CET 2012
 * XML source: /home/jens/programming/scala/uimaScala/uima-examples/ex1/src/main/resources/desc/types/com.github.jenshaase.uimascala.examples.ex1.TypeDescription.xml
 * @generated */
public class RoomNumber extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(RoomNumber.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected RoomNumber() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public RoomNumber(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public RoomNumber(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public RoomNumber(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: building

  /** getter for building - gets building containing this room
   * @generated */
  public String getBuilding() {
    if (RoomNumber_Type.featOkTst && ((RoomNumber_Type)jcasType).casFeat_building == null)
      jcasType.jcas.throwFeatMissing("building", "com.github.jenshaase.uimascala.examples.ex1.types.RoomNumber");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RoomNumber_Type)jcasType).casFeatCode_building);}
    
  /** setter for building - sets building containing this room 
   * @generated */
  public void setBuilding(String v) {
    if (RoomNumber_Type.featOkTst && ((RoomNumber_Type)jcasType).casFeat_building == null)
      jcasType.jcas.throwFeatMissing("building", "com.github.jenshaase.uimascala.examples.ex1.types.RoomNumber");
    jcasType.ll_cas.ll_setStringValue(addr, ((RoomNumber_Type)jcasType).casFeatCode_building, v);}    
  }

    