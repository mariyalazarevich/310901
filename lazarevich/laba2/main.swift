//
//  main.swift
//  lab2
//
//  Created by Мария Лазаревич on 2.12.24.
//

import Foundation

    
            print("Введите число:")
            if let inputX = readLine(), let x = Double(inputX) {
                func1(x)
            } else {
                print("Ошибка ввода!")
            }
       
            print("Введите два числа через пробел:")
            if let inputX = readLine() {
                let numbers = inputX.split(separator: " ").compactMap { Double($0) }
                if numbers.count == 2 {
                    func2(numbers[0], numbers[1])
                } else {
                    print("Ошибка ввода!")
                }
            } else {
                print("Ошибка ввода!")
            }

