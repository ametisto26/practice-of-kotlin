
var n: Int = 26
var m = 22.454
var l = 6.5e23

n = 15 // Int

var a: Any
a = 51
a = "Hi!"

var b = 0b1101
var c = 0xFF

var a1 = 123_456_789
var a2 = 0x AA_F4_1D


var b1 = 1000
var b2 = 1_000
var b3 = 0x3E8
b1 == b2
b2 == b3

var l1 = 12L // Lの小文字は禁止
var l2 = 55F // Fは大文字も小文字も可能
println(l1::class)
print(l2::class)
