# Password Strength Analyzer

A professional Java application that evaluates password strength based on security criteria.

## Features

- **Real-time Password Analysis**: Instantly analyze password strength
- **Multiple Security Criteria**: Checks 5 important password security rules
- **Detailed Feedback**: Shows exactly what passes and what needs improvement
- **Clear Strength Levels**: WEAK, MEDIUM, or STRONG classifications

## Security Criteria

The analyzer checks for:

1. **Minimum Length**: Password must be at least 8 characters
2. **Uppercase Letters**: Must contain at least one letter (A-Z)
3. **Lowercase Letters**: Must contain at least one letter (a-z)
4. **Numeric Digits**: Must contain at least one number (0-9)
5. **Special Characters**: Must contain @, #, $, %, ^, &, +, or =

## Strength Levels

| Score | Strength | Criteria Met |
|-------|----------|-------------|
| 0-2   | WEAK     | 0-2 out of 5 |
| 3-4   | MEDIUM   | 3-4 out of 5 |
| 5     | STRONG   | All 5 criteria |

## Usage

### Compilation
```bash
javac PasswordChecker.java
```

### Execution
```bash
java PasswordChecker
```

### Example Usage
```
=====================================
   PASSWORD STRENGTH ANALYZER v1.0   
=====================================

Enter password to analyze: Test@1234

=====================================
          ANALYSIS RESULTS           
=====================================

[PASS] Minimum 8 characters requirement met
[PASS] Contains uppercase letters (A-Z)
[PASS] Contains lowercase letters (a-z)
[PASS] Contains numeric digits (0-9)
[FAIL] Must contain special character (@#$%^&+=)

Criteria Met: 4 / 5
Password Strength: MEDIUM
Recommendation: Good, but add missing character types for better security
```

## System Requirements

- Java SE 8 or higher
- Compatible with Windows, macOS, and Linux

## Version

v1.0 - Initial Release
