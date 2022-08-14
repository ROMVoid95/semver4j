/*
 * The MIT License
 *
 * Copyright 2022 ROMVoid95 <rom.void95@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.romvoid95.semver4j.expr;

import io.github.romvoid95.semver4j.Version;

/**
 * Expression for the comparison "not equal" operator.
 */
class NotEqual implements Expression {

    /**
     * The parsed version, the right-hand operand of the "not equal" operator.
     */
    private final Version parsedVersion;

    /**
     * Constructs a {@code NotEqual} expression with the parsed version.
     *
     * @param parsedVersion the parsed version
     */
    NotEqual(Version parsedVersion) {
        this.parsedVersion = parsedVersion;
    }

    /**
     * Checks if the current version does not equal the parsed version.
     *
     * @param version the version to compare with, the left-hand
     *                operand of the "not equal" operator
     * @return {@code true} if the version does not equal the
     *         parsed version or {@code false} otherwise
     */
    @Override
    public boolean interpret(Version version) {
        return !version.equals(parsedVersion);
    }
}
