#pragma once

#include <cstdint>
#include <cstdlib>
#include <cmath>

namespace dexkit {

void _checkFailed(const char *expr, int line, const char *file);

#ifndef EPS
#define EPS 1e-6
#endif

#ifndef DEXKIT_CHECK
#ifdef NDEBUG
#define DEXKIT_CHECK(expr)
#else
#define DEXKIT_CHECK(expr) do { if(!(expr)) dexkit::_checkFailed(#expr, __LINE__, __FILE__); } while(false)
#endif
#endif

union FloatInt {
    int32_t int_value;
    float float_value;
};

union DoubleLong {
    int64_t long_value;
    double double_value;
};

union NumberValue {
    int8_t L8;
    int16_t L16;
    FloatInt L32;
    DoubleLong L64;
};

enum NumberType: uint8_t {
    BYTE = 1,
    SHORT = 2,
    INT = 3,
    LONG = 4,
    FLOAT = 5,
    DOUBLE = 6
};

struct EncodeNumber {
    NumberType type;
    NumberValue value;
};

constexpr uint8_t GetNumberSize(NumberType type) {
    switch (type) {
        case BYTE: return 8;
        case SHORT: return 16;
        case INT: return 32;
        case LONG: return 64;
        case FLOAT: return 32;
        case DOUBLE: return 64;
    }
}

inline double GetDoubleValue(EncodeNumber number) {
    switch (number.type) {
        case INT:
        case FLOAT: return number.value.L32.float_value;
        case LONG:
        case DOUBLE: return number.value.L64.double_value;
        default: return NAN;
    }
}

inline int64_t GetLongValue(EncodeNumber number) {
    switch (number.type) {
        case BYTE: return number.value.L8;
        case SHORT: return number.value.L16;
        case INT:
        case FLOAT: return number.value.L32.int_value;
        case LONG:
        case DOUBLE: return number.value.L64.long_value;
    }
}

}