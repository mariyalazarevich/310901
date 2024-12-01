//
//  function.swift
//  lab2
//
//  Created by Мария Лазаревич on 2.12.24.
//

func func1(_ x: Double) {
    var y = x
    var ch = Int(y)
    var zn = 1
    while y != Double(ch) {
        zn *= 10
        y *= 10
        ch = Int(y)
    }
    print("\(ch)/\(zn)")
}

func func2(_ x1: Double, _ x2: Double) {
    let ans = x1 / x2
    print(ans)
}
