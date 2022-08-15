/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/BlockchainAP1\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 50,000 free credits each month.</b> Each endpoint costs a certain amount credits. Scroll below to any endpoint (i.e., function) to see how much each endpoint costs. (Or CMD+F `Cost: 0 Credit`, for example)  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
 *
 * The version of the OpenAPI document: null
 * Contact: info@blockchainapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.client.model.CCPaymentBlockchainPaymentDetails;

/**
 * CCPayment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-15T09:33:08.779026-07:00[America/Los_Angeles]")
public class CCPayment {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_IDENTIFIER = "blockchain_identifier";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_IDENTIFIER)
  private String blockchainIdentifier;

  public static final String SERIALIZED_NAME_BLOCKCHAIN_PAYMENT_DETAILS = "blockchain_payment_details";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_PAYMENT_DETAILS)
  private CCPaymentBlockchainPaymentDetails blockchainPaymentDetails;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_PAYMENT_VALIDATION_CODE = "payment_validation_code";
  @SerializedName(SERIALIZED_NAME_PAYMENT_VALIDATION_CODE)
  private String paymentValidationCode;

  public static final String SERIALIZED_NAME_PERIOD_END = "period_end";
  @SerializedName(SERIALIZED_NAME_PERIOD_END)
  private BigDecimal periodEnd;

  public static final String SERIALIZED_NAME_PERIOD_START = "period_start";
  @SerializedName(SERIALIZED_NAME_PERIOD_START)
  private BigDecimal periodStart;

  public static final String SERIALIZED_NAME_TRANSACTION_BLOCKCHAIN_IDENTIFIER = "transaction_blockchain_identifier";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_BLOCKCHAIN_IDENTIFIER)
  private String transactionBlockchainIdentifier;

  public CCPayment() { 
  }

  public CCPayment projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project 
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project ")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public CCPayment productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the associated product 
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the associated product ")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public CCPayment planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * The ID of the respective plan 
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the respective plan ")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public CCPayment paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The unique ID of the payment 
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the payment ")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public CCPayment blockchainIdentifier(String blockchainIdentifier) {
    
    this.blockchainIdentifier = blockchainIdentifier;
    return this;
  }

   /**
   * The unique identifier of the wallet from which the payment was made. 
   * @return blockchainIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the wallet from which the payment was made. ")

  public String getBlockchainIdentifier() {
    return blockchainIdentifier;
  }


  public void setBlockchainIdentifier(String blockchainIdentifier) {
    this.blockchainIdentifier = blockchainIdentifier;
  }


  public CCPayment blockchainPaymentDetails(CCPaymentBlockchainPaymentDetails blockchainPaymentDetails) {
    
    this.blockchainPaymentDetails = blockchainPaymentDetails;
    return this;
  }

   /**
   * Get blockchainPaymentDetails
   * @return blockchainPaymentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CCPaymentBlockchainPaymentDetails getBlockchainPaymentDetails() {
    return blockchainPaymentDetails;
  }


  public void setBlockchainPaymentDetails(CCPaymentBlockchainPaymentDetails blockchainPaymentDetails) {
    this.blockchainPaymentDetails = blockchainPaymentDetails;
  }


  public CCPayment customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The ID of the customer 
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the customer ")

  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CCPayment paymentValidationCode(String paymentValidationCode) {
    
    this.paymentValidationCode = paymentValidationCode;
    return this;
  }

   /**
   * The validation code shown to the customer. This is only visible to the customer who paid. They can use this code to redeem their subscription to their product. 
   * @return paymentValidationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validation code shown to the customer. This is only visible to the customer who paid. They can use this code to redeem their subscription to their product. ")

  public String getPaymentValidationCode() {
    return paymentValidationCode;
  }


  public void setPaymentValidationCode(String paymentValidationCode) {
    this.paymentValidationCode = paymentValidationCode;
  }


  public CCPayment periodEnd(BigDecimal periodEnd) {
    
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * A UNIX time stamp, in seconds, that identifies the end of the period of the subscription 
   * @return periodEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A UNIX time stamp, in seconds, that identifies the end of the period of the subscription ")

  public BigDecimal getPeriodEnd() {
    return periodEnd;
  }


  public void setPeriodEnd(BigDecimal periodEnd) {
    this.periodEnd = periodEnd;
  }


  public CCPayment periodStart(BigDecimal periodStart) {
    
    this.periodStart = periodStart;
    return this;
  }

   /**
   * A UNIX time stamp, in seconds, that identifies the start of the period of the subscription 
   * @return periodStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A UNIX time stamp, in seconds, that identifies the start of the period of the subscription ")

  public BigDecimal getPeriodStart() {
    return periodStart;
  }


  public void setPeriodStart(BigDecimal periodStart) {
    this.periodStart = periodStart;
  }


  public CCPayment transactionBlockchainIdentifier(String transactionBlockchainIdentifier) {
    
    this.transactionBlockchainIdentifier = transactionBlockchainIdentifier;
    return this;
  }

   /**
   * The string that uniquely identifies the blockchain transaction 
   * @return transactionBlockchainIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The string that uniquely identifies the blockchain transaction ")

  public String getTransactionBlockchainIdentifier() {
    return transactionBlockchainIdentifier;
  }


  public void setTransactionBlockchainIdentifier(String transactionBlockchainIdentifier) {
    this.transactionBlockchainIdentifier = transactionBlockchainIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CCPayment ccPayment = (CCPayment) o;
    return Objects.equals(this.projectId, ccPayment.projectId) &&
        Objects.equals(this.productId, ccPayment.productId) &&
        Objects.equals(this.planId, ccPayment.planId) &&
        Objects.equals(this.paymentId, ccPayment.paymentId) &&
        Objects.equals(this.blockchainIdentifier, ccPayment.blockchainIdentifier) &&
        Objects.equals(this.blockchainPaymentDetails, ccPayment.blockchainPaymentDetails) &&
        Objects.equals(this.customerId, ccPayment.customerId) &&
        Objects.equals(this.paymentValidationCode, ccPayment.paymentValidationCode) &&
        Objects.equals(this.periodEnd, ccPayment.periodEnd) &&
        Objects.equals(this.periodStart, ccPayment.periodStart) &&
        Objects.equals(this.transactionBlockchainIdentifier, ccPayment.transactionBlockchainIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, productId, planId, paymentId, blockchainIdentifier, blockchainPaymentDetails, customerId, paymentValidationCode, periodEnd, periodStart, transactionBlockchainIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CCPayment {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    blockchainIdentifier: ").append(toIndentedString(blockchainIdentifier)).append("\n");
    sb.append("    blockchainPaymentDetails: ").append(toIndentedString(blockchainPaymentDetails)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentValidationCode: ").append(toIndentedString(paymentValidationCode)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    transactionBlockchainIdentifier: ").append(toIndentedString(transactionBlockchainIdentifier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

