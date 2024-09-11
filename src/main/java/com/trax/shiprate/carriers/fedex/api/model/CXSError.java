package com.trax.shiprate.carriers.fedex.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * CXSError
 */

//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-10T20:55:07.300722839Z[GMT]")

public class CXSError {
  @SerializedName("code")
  private String code = null;

  @SerializedName("parameterList")
  private List<Parameter> parameterList = null;

  @SerializedName("message")
  private String message = null;

  public CXSError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Indicates the error code.&lt;br&gt;Example: NOT.FOUND.ERROR
   * @return code
  **/
  @Schema(description = "Indicates the error code.<br>Example: NOT.FOUND.ERROR")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CXSError parameterList(List<Parameter> parameterList) {
    this.parameterList = parameterList;
    return this;
  }

  public CXSError addParameterListItem(Parameter parameterListItem) {
    if (this.parameterList == null) {
      this.parameterList = new ArrayList<Parameter>();
    }
    this.parameterList.add(parameterListItem);
    return this;
  }

   /**
   * List of parameters which indicates the properties of the alert message.
   * @return parameterList
  **/
  @Schema(description = "List of parameters which indicates the properties of the alert message.")
  public List<Parameter> getParameterList() {
    return parameterList;
  }

  public void setParameterList(List<Parameter> parameterList) {
    this.parameterList = parameterList;
  }

  public CXSError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Indicates the API error alert message.&lt;br&gt;Example: We are unable to process this request. Please try again later or contact FedEx Customer Service.
   * @return message
  **/
  @Schema(example = "We are unable to process this request. Please try again later or contact FedEx Customer Service.", description = "Indicates the API error alert message.<br>Example: We are unable to process this request. Please try again later or contact FedEx Customer Service.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CXSError cxSError = (CXSError) o;
    return Objects.equals(this.code, cxSError.code) &&
        Objects.equals(this.parameterList, cxSError.parameterList) &&
        Objects.equals(this.message, cxSError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, parameterList, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CXSError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    parameterList: ").append(toIndentedString(parameterList)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
