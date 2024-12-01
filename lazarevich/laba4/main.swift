//
//  main.swift
//  lab4
//
//  Created by Мария Лазаревич on 2.12.24.
//

import Foundation

var num = Number<Int>(5)
var result: Int = num.sum(6)
print(result)
result = num.min(1)
print(result)

result = num.mult(3)
print(result)
var dres: Double = num.div(4)
print(dres)
dres = num.power(2)
print(dres)

