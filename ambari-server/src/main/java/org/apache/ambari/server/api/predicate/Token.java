/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.api.predicate;

/**
 * Token representation which is generated by the lexer.
 * Contains type and value information.
 */
public class Token {

  /**
   * Token types.
   */
  public enum TYPE {
    /** Property name operand.  This is the left operand in relational expressions. */
    PROPERTY_OPERAND,
    /** Value operand.  This is the right operand in relational expressions. */
    VALUE_OPERAND,
    /** Relational operator */
    RELATIONAL_OPERATOR,
    /** Relational operator function */
    RELATIONAL_OPERATOR_FUNC,
    /** Logical operator */
    LOGICAL_OPERATOR,
    /** Logical unary operator such as !*/
    LOGICAL_UNARY_OPERATOR,
    /** Opening bracket */
    BRACKET_OPEN,
    /** Closing bracket */
    BRACKET_CLOSE
  }

  /**
   * Token type.
   */
  private TYPE m_type;

  /**
   * Token value.
   */
  private String m_value;


  /**
   * Constructor.
   *
   * @param type   type
   * @param value  value
   */
  public Token(TYPE type, String value) {
    m_type = type;
    m_value = value;
  }

  /**
   * Get the token type.
   * @return token type
   */
  public TYPE getType() {
    return m_type;
  }

  /**
   * Get the token value.
   * @return token value
   */
  public String getValue() {
    return m_value;
  }

  @Override
  public String toString() {
    return "Token{ type=" + m_type + ", value='" + m_value + "' }";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Token token = (Token) o;

    return m_type == token.m_type &&
        (m_value == null ? token.m_value == null : m_value.equals(token.m_value));
  }

  @Override
  public int hashCode() {
    int result = m_type.hashCode();
    result = 31 * result + (m_value != null ? m_value.hashCode() : 0);

    return result;
  }
}
