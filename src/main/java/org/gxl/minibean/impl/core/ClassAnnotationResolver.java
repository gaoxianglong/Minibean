/*
 * Copyright 2015-2101 gaoxianglong
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
package org.gxl.minibean.impl.core;

import org.gxl.minibean.bean.annotations.Assignment;
import org.gxl.minibean.core.AnnotationResolver;

/**
 * 类型注解解析器，用于解析标记了@Assignment的类型
 * 
 * @author JohnGao
 */
public class ClassAnnotationResolver extends AnnotationResolver {
	public <T> boolean classResolver(T goalObject) {
		/* 检测目标对象是否标记有@Assignment注解 */
		return goalObject.getClass().isAnnotationPresent(Assignment.class);
	}
}