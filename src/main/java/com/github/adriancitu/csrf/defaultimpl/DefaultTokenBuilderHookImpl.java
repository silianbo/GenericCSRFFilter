/**
 * MIT License
 *
 * Copyright (c) 2016 Adrian CITU
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package com.github.adriancitu.csrf.defaultimpl;

import com.github.adriancitu.csrf.ExecutionContext;
import com.github.adriancitu.csrf.TokenBuilderHook;

import java.io.IOException;
import java.util.UUID;


/**
 * 
 * @author Adrian CITU
 *
 */
public final class DefaultTokenBuilderHookImpl implements TokenBuilderHook {

	/**
	 * Compute the CSRF token as a random {@link UUID}.
	 */
	@Override
	public String buildToken(final ExecutionContext executionContext) {
		return UUID.randomUUID().toString();
	}

	@Override
	public void close() throws IOException {
		//nothing to be done
	}

}
