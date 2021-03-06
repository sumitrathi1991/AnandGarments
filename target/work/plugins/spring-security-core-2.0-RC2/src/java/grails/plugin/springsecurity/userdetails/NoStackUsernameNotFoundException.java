/* Copyright 2013 SpringSource.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grails.plugin.springsecurity.userdetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Lightweight exception that avoids the cost of filling in the stack frames.
 *
 * @author <a href='mailto:burt@burtbeckwith.com'>Burt Beckwith</a>
 */
public class NoStackUsernameNotFoundException extends UsernameNotFoundException {
	private static final long serialVersionUID = 1;

	public NoStackUsernameNotFoundException() {
		super("User not found");
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		// do nothing
		return this;
	}
}
