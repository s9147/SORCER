/*
 * Copyright 2009 the original author or authors.
 * Copyright 2009 SorcerSoft.org.
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
package sorcer.co.tuple;

import sorcer.core.context.model.ent.Entry;
import sorcer.service.Signature;

public class OutputEntry<T> extends Entry<T> {

	private static final long serialVersionUID = 1L;

	public OutputEntry() {
		super();
        annotation = Signature.Direction.OUT;
    }

	public OutputEntry(String path) {
        this(path, null, false, 0);
	}

	public OutputEntry(String path, T value) {
        this(path, value, false, 0);
    }

    public OutputEntry(String path, T value, int index) {
		this(path, value, false, index);
    }

	public OutputEntry(String path, T value, boolean isPersistant, int index) {
		super(path, value, isPersistant, index);
        annotation = Signature.Direction.OUT;
    }

}