// automatically generated by the FlatBuffers compiler, do not modify

package org.luckypray.dexkit.schema

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
class MethodMatcher : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : MethodMatcher {
        __init(_i, _bb)
        return this
    }
    val methodName : StringMatcher? get() = methodName(StringMatcher())
    fun methodName(obj: StringMatcher) : StringMatcher? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val accessFlags : AccessFlagsMatcher? get() = accessFlags(AccessFlagsMatcher())
    fun accessFlags(obj: AccessFlagsMatcher) : AccessFlagsMatcher? {
        val o = __offset(6)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val declaringClass : ClassMatcher? get() = declaringClass(ClassMatcher())
    fun declaringClass(obj: ClassMatcher) : ClassMatcher? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val returnType : ClassMatcher? get() = returnType(ClassMatcher())
    fun returnType(obj: ClassMatcher) : ClassMatcher? {
        val o = __offset(10)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val parameters : ParametersMatcher? get() = parameters(ParametersMatcher())
    fun parameters(obj: ParametersMatcher) : ParametersMatcher? {
        val o = __offset(12)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val annotations : AnnotationsMatcher? get() = annotations(AnnotationsMatcher())
    fun annotations(obj: AnnotationsMatcher) : AnnotationsMatcher? {
        val o = __offset(14)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val opCodes : OpCodesMatcher? get() = opCodes(OpCodesMatcher())
    fun opCodes(obj: OpCodesMatcher) : OpCodesMatcher? {
        val o = __offset(16)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    fun usingStrings(j: Int) : StringMatcher? = usingStrings(StringMatcher(), j)
    fun usingStrings(obj: StringMatcher, j: Int) : StringMatcher? {
        val o = __offset(18)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val usingStringsLength : Int
        get() {
            val o = __offset(18); return if (o != 0) __vector_len(o) else 0
        }
    fun usingFiels(j: Int) : UsingFieldMatcher? = usingFiels(UsingFieldMatcher(), j)
    fun usingFiels(obj: UsingFieldMatcher, j: Int) : UsingFieldMatcher? {
        val o = __offset(20)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val usingFielsLength : Int
        get() {
            val o = __offset(20); return if (o != 0) __vector_len(o) else 0
        }
    fun usingNumbers(j: Int) : UsingNumberMatcher? = usingNumbers(UsingNumberMatcher(), j)
    fun usingNumbers(obj: UsingNumberMatcher, j: Int) : UsingNumberMatcher? {
        val o = __offset(22)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val usingNumbersLength : Int
        get() {
            val o = __offset(22); return if (o != 0) __vector_len(o) else 0
        }
    val invokeMethods : MethodsMatcher? get() = invokeMethods(MethodsMatcher())
    fun invokeMethods(obj: MethodsMatcher) : MethodsMatcher? {
        val o = __offset(24)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val callMethods : MethodsMatcher? get() = callMethods(MethodsMatcher())
    fun callMethods(obj: MethodsMatcher) : MethodsMatcher? {
        val o = __offset(26)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsMethodMatcher(_bb: ByteBuffer): MethodMatcher = getRootAsMethodMatcher(_bb, MethodMatcher())
        fun getRootAsMethodMatcher(_bb: ByteBuffer, obj: MethodMatcher): MethodMatcher {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createMethodMatcher(builder: FlatBufferBuilder, methodNameOffset: Int, accessFlagsOffset: Int, declaringClassOffset: Int, returnTypeOffset: Int, parametersOffset: Int, annotationsOffset: Int, opCodesOffset: Int, usingStringsOffset: Int, usingFielsOffset: Int, usingNumbersOffset: Int, invokeMethodsOffset: Int, callMethodsOffset: Int) : Int {
            builder.startTable(12)
            addCallMethods(builder, callMethodsOffset)
            addInvokeMethods(builder, invokeMethodsOffset)
            addUsingNumbers(builder, usingNumbersOffset)
            addUsingFiels(builder, usingFielsOffset)
            addUsingStrings(builder, usingStringsOffset)
            addOpCodes(builder, opCodesOffset)
            addAnnotations(builder, annotationsOffset)
            addParameters(builder, parametersOffset)
            addReturnType(builder, returnTypeOffset)
            addDeclaringClass(builder, declaringClassOffset)
            addAccessFlags(builder, accessFlagsOffset)
            addMethodName(builder, methodNameOffset)
            return endMethodMatcher(builder)
        }
        fun startMethodMatcher(builder: FlatBufferBuilder) = builder.startTable(12)
        fun addMethodName(builder: FlatBufferBuilder, methodName: Int) = builder.addOffset(0, methodName, 0)
        fun addAccessFlags(builder: FlatBufferBuilder, accessFlags: Int) = builder.addOffset(1, accessFlags, 0)
        fun addDeclaringClass(builder: FlatBufferBuilder, declaringClass: Int) = builder.addOffset(2, declaringClass, 0)
        fun addReturnType(builder: FlatBufferBuilder, returnType: Int) = builder.addOffset(3, returnType, 0)
        fun addParameters(builder: FlatBufferBuilder, parameters: Int) = builder.addOffset(4, parameters, 0)
        fun addAnnotations(builder: FlatBufferBuilder, annotations: Int) = builder.addOffset(5, annotations, 0)
        fun addOpCodes(builder: FlatBufferBuilder, opCodes: Int) = builder.addOffset(6, opCodes, 0)
        fun addUsingStrings(builder: FlatBufferBuilder, usingStrings: Int) = builder.addOffset(7, usingStrings, 0)
        fun createUsingStringsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startUsingStringsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addUsingFiels(builder: FlatBufferBuilder, usingFiels: Int) = builder.addOffset(8, usingFiels, 0)
        fun createUsingFielsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startUsingFielsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addUsingNumbers(builder: FlatBufferBuilder, usingNumbers: Int) = builder.addOffset(9, usingNumbers, 0)
        fun createUsingNumbersVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startUsingNumbersVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addInvokeMethods(builder: FlatBufferBuilder, invokeMethods: Int) = builder.addOffset(10, invokeMethods, 0)
        fun addCallMethods(builder: FlatBufferBuilder, callMethods: Int) = builder.addOffset(11, callMethods, 0)
        fun endMethodMatcher(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}