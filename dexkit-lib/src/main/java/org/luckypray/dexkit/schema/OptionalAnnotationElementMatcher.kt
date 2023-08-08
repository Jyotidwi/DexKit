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
class OptionalAnnotationElementMatcher : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : OptionalAnnotationElementMatcher {
        __init(_i, _bb)
        return this
    }
    val element : AnnotationElementMatcher? get() = element(AnnotationElementMatcher())
    fun element(obj: AnnotationElementMatcher) : AnnotationElementMatcher? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsOptionalAnnotationElementMatcher(_bb: ByteBuffer): OptionalAnnotationElementMatcher = getRootAsOptionalAnnotationElementMatcher(_bb, OptionalAnnotationElementMatcher())
        fun getRootAsOptionalAnnotationElementMatcher(_bb: ByteBuffer, obj: OptionalAnnotationElementMatcher): OptionalAnnotationElementMatcher {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createOptionalAnnotationElementMatcher(builder: FlatBufferBuilder, elementOffset: Int) : Int {
            builder.startTable(1)
            addElement(builder, elementOffset)
            return endOptionalAnnotationElementMatcher(builder)
        }
        fun startOptionalAnnotationElementMatcher(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addElement(builder: FlatBufferBuilder, element: Int) = builder.addOffset(0, element, 0)
        fun endOptionalAnnotationElementMatcher(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}