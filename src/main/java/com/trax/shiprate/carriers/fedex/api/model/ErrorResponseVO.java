package com.trax.shiprate.carriers.fedex.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * ErrorResponseVO
 */

//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-10T20:55:07.300722839Z[GMT]")

public class ErrorResponseVO {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("errors")
  private List<CXSError> errors = null;

  public ErrorResponseVO transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The transaction ID is a special set of numbers that defines each transaction.&lt;br&gt;Example: bc95c0e4-b33e-42a2-80d2-334282b5d37a
   * @return transactionId
  **/
  @Schema(example = "bc95c0e4-b33e-42a2-80d2-334282b5d37a", description = "The transaction ID is a special set of numbers that defines each transaction.<br>Example: bc95c0e4-b33e-42a2-80d2-334282b5d37a")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public ErrorResponseVO errors(List<CXSError> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponseVO addErrorsItem(CXSError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<CXSError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Indicates error details when suspicious files, potential exploits and viruses are found while scanning files, directories and user accounts. This includes code, message and error parameters.
   * @return errors
  **/
  @Schema(description = "Indicates error details when suspicious files, potential exploits and viruses are found while scanning files, directories and user accounts. This includes code, message and error parameters.")
  public List<CXSError> getErrors() {
    return errors;
  }

  public void setErrors(List<CXSError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseVO errorResponseVO = (ErrorResponseVO) o;
    return Objects.equals(this.transactionId, errorResponseVO.transactionId) &&
        Objects.equals(this.errors, errorResponseVO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseVO {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
