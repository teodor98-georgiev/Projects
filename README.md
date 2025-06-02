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
