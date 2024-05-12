#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat May 11 19:57:44 2024

@author: jorge
"""

import numpy as np

lunchAccount = eval(input("How much money (in dollars) in your lunch account? "))
today = eval(input("What day of the month is today? "))
daysMonth = eval(input("How many days in this month? "))

foods = 1
numberOfDays = daysMonth - today

spend = np.divide(lunchAccount,(numberOfDays + 1)*foods)

print("You can spend ${0:0.2f} each day for the rest of the month!".format(spend))