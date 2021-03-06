/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btMotionState {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btMotionState(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btMotionState obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btMotionState(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  public static btMotionState newDerivedObject(long swigCPtr, boolean owner) {
    if (swigCPtr == 0) {
      return null;
    }
    
    // There's currently just one implementation.
    return new btDefaultMotionState(swigCPtr, owner);
  }

  public void getWorldTransform(btTransform worldTrans) {
    gdxBulletJNI.btMotionState_getWorldTransform(swigCPtr, this, btTransform.getCPtr(worldTrans), worldTrans);
  }

  public void setWorldTransform(btTransform worldTrans) {
    gdxBulletJNI.btMotionState_setWorldTransform(swigCPtr, this, btTransform.getCPtr(worldTrans), worldTrans);
  }

}
