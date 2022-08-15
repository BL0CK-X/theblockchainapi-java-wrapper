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

/**
 * The information necessary to verify the payment.  
 */
@ApiModel(description = "The information necessary to verify the payment.  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-15T09:33:08.779026-07:00[America/Los_Angeles]")
public class CCPaymentBlockchainPaymentDetails {
  /**
   * The chain on which the payment was made. 
   */
  @JsonAdapter(ChainEnum.Adapter.class)
  public enum ChainEnum {
    SOLANA("solana");

    private String value;

    ChainEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChainEnum fromValue(String value) {
      for (ChainEnum b : ChainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChainEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChainEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChainEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChainEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private ChainEnum chain;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "fee_amount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private String feeAmount;

  public static final String SERIALIZED_NAME_PAYOUT_AMOUNT = "payout_amount";
  @SerializedName(SERIALIZED_NAME_PAYOUT_AMOUNT)
  private String payoutAmount;

  public static final String SERIALIZED_NAME_TOKEN_BLOCKCHAIN_IDENTIFIER = "token_blockchain_identifier";
  @SerializedName(SERIALIZED_NAME_TOKEN_BLOCKCHAIN_IDENTIFIER)
  private String tokenBlockchainIdentifier;

  public static final String SERIALIZED_NAME_TOTAL_PAID = "total_paid";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAID)
  private String totalPaid;

  public static final String SERIALIZED_NAME_TRANSACTION_SIGNATURE = "transaction_signature";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SIGNATURE)
  private String transactionSignature;

  public CCPaymentBlockchainPaymentDetails() { 
  }

  public CCPaymentBlockchainPaymentDetails chain(ChainEnum chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * The chain on which the payment was made. 
   * @return chain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The chain on which the payment was made. ")

  public ChainEnum getChain() {
    return chain;
  }


  public void setChain(ChainEnum chain) {
    this.chain = chain;
  }


  public CCPaymentBlockchainPaymentDetails feeAmount(String feeAmount) {
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * The fee taken by the blockchain API. This is shown in integer form. 
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fee taken by the blockchain API. This is shown in integer form. ")

  public String getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }


  public CCPaymentBlockchainPaymentDetails payoutAmount(String payoutAmount) {
    
    this.payoutAmount = payoutAmount;
    return this;
  }

   /**
   * The amount paid to the project&#39;s payout wallet (the recipient of the payment). This is shown in integer form. 
   * @return payoutAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount paid to the project's payout wallet (the recipient of the payment). This is shown in integer form. ")

  public String getPayoutAmount() {
    return payoutAmount;
  }


  public void setPayoutAmount(String payoutAmount) {
    this.payoutAmount = payoutAmount;
  }


  public CCPaymentBlockchainPaymentDetails tokenBlockchainIdentifier(String tokenBlockchainIdentifier) {
    
    this.tokenBlockchainIdentifier = tokenBlockchainIdentifier;
    return this;
  }

   /**
   * The blockchain identifier of the token used to pay. Currently, we only support payments in USDC. 
   * @return tokenBlockchainIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The blockchain identifier of the token used to pay. Currently, we only support payments in USDC. ")

  public String getTokenBlockchainIdentifier() {
    return tokenBlockchainIdentifier;
  }


  public void setTokenBlockchainIdentifier(String tokenBlockchainIdentifier) {
    this.tokenBlockchainIdentifier = tokenBlockchainIdentifier;
  }


  public CCPaymentBlockchainPaymentDetails totalPaid(String totalPaid) {
    
    this.totalPaid = totalPaid;
    return this;
  }

   /**
   * The total paid by the user when making the payment. This should match the amount set in the respective plan. 
   * @return totalPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total paid by the user when making the payment. This should match the amount set in the respective plan. ")

  public String getTotalPaid() {
    return totalPaid;
  }


  public void setTotalPaid(String totalPaid) {
    this.totalPaid = totalPaid;
  }


  public CCPaymentBlockchainPaymentDetails transactionSignature(String transactionSignature) {
    
    this.transactionSignature = transactionSignature;
    return this;
  }

   /**
   * The transaction signature which you can use to manually or automatically verify the transaction on the blockchain. 
   * @return transactionSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction signature which you can use to manually or automatically verify the transaction on the blockchain. ")

  public String getTransactionSignature() {
    return transactionSignature;
  }


  public void setTransactionSignature(String transactionSignature) {
    this.transactionSignature = transactionSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CCPaymentBlockchainPaymentDetails ccPaymentBlockchainPaymentDetails = (CCPaymentBlockchainPaymentDetails) o;
    return Objects.equals(this.chain, ccPaymentBlockchainPaymentDetails.chain) &&
        Objects.equals(this.feeAmount, ccPaymentBlockchainPaymentDetails.feeAmount) &&
        Objects.equals(this.payoutAmount, ccPaymentBlockchainPaymentDetails.payoutAmount) &&
        Objects.equals(this.tokenBlockchainIdentifier, ccPaymentBlockchainPaymentDetails.tokenBlockchainIdentifier) &&
        Objects.equals(this.totalPaid, ccPaymentBlockchainPaymentDetails.totalPaid) &&
        Objects.equals(this.transactionSignature, ccPaymentBlockchainPaymentDetails.transactionSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chain, feeAmount, payoutAmount, tokenBlockchainIdentifier, totalPaid, transactionSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CCPaymentBlockchainPaymentDetails {\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    tokenBlockchainIdentifier: ").append(toIndentedString(tokenBlockchainIdentifier)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    transactionSignature: ").append(toIndentedString(transactionSignature)).append("\n");
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

