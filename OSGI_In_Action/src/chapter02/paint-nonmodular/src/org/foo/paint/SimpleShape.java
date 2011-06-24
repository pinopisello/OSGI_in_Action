/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.foo.paint;

import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.Icon;

/**
 * Interface representing a simple drawable shape.
 **/
public interface SimpleShape {

  public String getName();

  public Icon getIcon();

  /**
   * Draw this shape at the given position.
   * 
   * @param g2 The graphics object used for painting.
   * @param p The position to paint the shape.
   **/
  public void draw(Graphics2D g2, Point p);
}
