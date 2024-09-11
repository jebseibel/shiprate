package com.trax.shiprate.carriers.fedex.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This is the response of OAuth token and having access token details.
 */
@Schema(description = "This is the response of OAuth token and having access token details.")
//@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-10T20:55:07.300722839Z[GMT]")

public class Response {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("scope")
  private String scope = null;

  public Response accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * This is an encrypted OAuth token used to authenticate your API requests. Use it in the authorization header of your API requests.&lt;br&gt;Example:  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpX……
   * @return accessToken
  **/
  @Schema(example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpX……", description = "This is an encrypted OAuth token used to authenticate your API requests. Use it in the authorization header of your API requests.<br>Example:  eyJhbGciOiJIUzI1NiIsInR5cCI6IkpX……")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Response tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * This is a token type. In this case, it is &#x27;bearer authentication&#x27;.
   * @return tokenType
  **/
  @Schema(example = "bearer", description = "This is a token type. In this case, it is 'bearer authentication'.")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public Response expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Indicates the token expiration time in seconds. The standard token expiration time is one hour. &lt;br&gt;Example: 3600
   * @return expiresIn
  **/
  @Schema(example = "3600", description = "Indicates the token expiration time in seconds. The standard token expiration time is one hour. <br>Example: 3600")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public Response scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates the scope of authorization provided to the consumer.&lt;br&gt; Example: CXS
   * @return scope
  **/
  @Schema(example = "CXS", description = "Indicates the scope of authorization provided to the consumer.<br> Example: CXS")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.accessToken, response.accessToken) &&
        Objects.equals(this.tokenType, response.tokenType) &&
        Objects.equals(this.expiresIn, response.expiresIn) &&
        Objects.equals(this.scope, response.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
