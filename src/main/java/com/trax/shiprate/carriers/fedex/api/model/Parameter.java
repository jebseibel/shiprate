package com.trax.shiprate.carriers.fedex.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Parameter
 */

//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-10T20:55:07.300722839Z[GMT]")

public class Parameter {
  @SerializedName("value")
  private String value = null;

  @SerializedName("key")
  private String key = null;

  public Parameter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Indicates the error option to be applied.
   * @return value
  **/
  @Schema(description = "Indicates the error option to be applied.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Parameter key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Indicates the value associated with the key.
   * @return key
  **/
  @Schema(description = "Indicates the value associated with the key.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(this.value, parameter.value) &&
        Objects.equals(this.key, parameter.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
