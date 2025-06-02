# Strange Counter
## Problem Summary

A strange counter starts at 3 and counts down to 1. When it reaches 1, the counter resets to double the previous cycle's start value and begins counting down again.

The counter sequence behaves as follows:

- Cycle 1: starts at `t = 1`, displays `3, 2, 1`
- Cycle 2: starts at `t = 4`, displays `6, 5, 4, 3, 2, 1`
- Cycle 3: starts at `t = 10`, displays `12, ..., 1`
- And so on...

Each cycle's starting value doubles from the previous one: 3 → 6 → 12 → 24...

## Task

Implement a function that computes the value displayed by the counter at a given time `t`.

# Diagonal Difference
## Problem Statement

Given a square matrix, calculate the **absolute difference** between the sums of its **primary diagonal** (top-left to bottom-right) and **secondary diagonal** (top-right to bottom-left).

# Day of the Programmer
## Task Description

This task involves determining the "Day of the Programmer" (the 256th day of the year) in Russia, taking into account historical calendar transitions.

Russia switched from the **Julian** to **Gregorian** calendar in **1918**, where February 14th immediately followed January 31st, making February only 15 days long that year. This affects how the 256th day of the year is computed depending on the calendar system used in a given year.

### Calendar Rules

- **Julian Calendar (1700–1917):**
  - Leap year if divisible by 4.

- **Transition Year (1918):**
  - February has 15 days (Feb 14 is the 32nd day of the year).

- **Gregorian Calendar (1919–2700):**
  - Leap year if:
    - Divisible by 400, OR
    - Divisible by 4 and NOT divisible by 100.

### Output Format

Return the 256th day in the format: `dd.mm.yyyy

# Encryption Task
## Description

This task is to implement a text encryption function based on a specific grid-based scheme. The goal is to encode a given lowercase English string using a transformation that involves arranging characters in a grid and then reading them column-wise.

## Problem Summary

Given a string `s`:
1. **Remove all spaces** from the input string.
2. Compute the length `L` of the resulting string.
3. Determine the number of **rows and columns** for a grid such that:
   - `floor(sqrt(L)) <= rows <= columns <= ceil(sqrt(L))`
   - `rows * columns >= L`
   - Among all possible grid sizes, choose the one with the **smallest area** (minimum `rows * columns`)
4. **Fill the grid row-wise** with the characters of the processed string.
5. **Read the grid column-wise**, joining characters from top to bottom and separating columns with spaces.
