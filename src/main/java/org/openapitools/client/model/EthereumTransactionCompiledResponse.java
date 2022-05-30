/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 100 free credits. Each user can call endpoints that cost 0 credits up to 50 requests/min before being rate-limited.</b> Thereafter, they can upgrade to have a higher rate limit. The purpose of this is to act like a free trial -- not to function like a freemium model where one can stay on the free tier indefinitely.  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-csharp-wrapper\" target = \"_blank\">C#</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-dart-wrapper\" target = \"_blank\">Dart</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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

/**
 * EthereumTransactionCompiledResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T11:04:39.768692-07:00[America/Los_Angeles]")
public class EthereumTransactionCompiledResponse {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_GAS = "gas";
  @SerializedName(SERIALIZED_NAME_GAS)
  private BigDecimal gas;

  public static final String SERIALIZED_NAME_MAX_FEE_PER_GAS = "max_fee_per_gas";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_PER_GAS)
  private BigDecimal maxFeePerGas;

  public static final String SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS = "max_priority_fee_per_gas";
  @SerializedName(SERIALIZED_NAME_MAX_PRIORITY_FEE_PER_GAS)
  private BigDecimal maxPriorityFeePerGas;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private BigDecimal nonce;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public EthereumTransactionCompiledResponse() { 
  }

  public EthereumTransactionCompiledResponse chainId(String chainId) {
    
    this.chainId = chainId;
    return this;
  }

   /**
   * Indicates the chain that the transaction was compiled for (e.g., ropsten or mainnet). 
   * @return chainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the chain that the transaction was compiled for (e.g., ropsten or mainnet). ")

  public String getChainId() {
    return chainId;
  }


  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public EthereumTransactionCompiledResponse data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * The transaction data 
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction data ")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public EthereumTransactionCompiledResponse from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The address expected to sign and submit the transaction 
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address expected to sign and submit the transaction ")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public EthereumTransactionCompiledResponse to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The contract. This should match your provided value for &#x60;token_blockchain_identifier&#x60;. 
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contract. This should match your provided value for `token_blockchain_identifier`. ")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public EthereumTransactionCompiledResponse gas(BigDecimal gas) {
    
    this.gas = gas;
    return this;
  }

   /**
   * Get gas
   * @return gas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getGas() {
    return gas;
  }


  public void setGas(BigDecimal gas) {
    this.gas = gas;
  }


  public EthereumTransactionCompiledResponse maxFeePerGas(BigDecimal maxFeePerGas) {
    
    this.maxFeePerGas = maxFeePerGas;
    return this;
  }

   /**
   * Get maxFeePerGas
   * @return maxFeePerGas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxFeePerGas() {
    return maxFeePerGas;
  }


  public void setMaxFeePerGas(BigDecimal maxFeePerGas) {
    this.maxFeePerGas = maxFeePerGas;
  }


  public EthereumTransactionCompiledResponse maxPriorityFeePerGas(BigDecimal maxPriorityFeePerGas) {
    
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
    return this;
  }

   /**
   * Get maxPriorityFeePerGas
   * @return maxPriorityFeePerGas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxPriorityFeePerGas() {
    return maxPriorityFeePerGas;
  }


  public void setMaxPriorityFeePerGas(BigDecimal maxPriorityFeePerGas) {
    this.maxPriorityFeePerGas = maxPriorityFeePerGas;
  }


  public EthereumTransactionCompiledResponse nonce(BigDecimal nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNonce() {
    return nonce;
  }


  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }


  public EthereumTransactionCompiledResponse value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthereumTransactionCompiledResponse ethereumTransactionCompiledResponse = (EthereumTransactionCompiledResponse) o;
    return Objects.equals(this.chainId, ethereumTransactionCompiledResponse.chainId) &&
        Objects.equals(this.data, ethereumTransactionCompiledResponse.data) &&
        Objects.equals(this.from, ethereumTransactionCompiledResponse.from) &&
        Objects.equals(this.to, ethereumTransactionCompiledResponse.to) &&
        Objects.equals(this.gas, ethereumTransactionCompiledResponse.gas) &&
        Objects.equals(this.maxFeePerGas, ethereumTransactionCompiledResponse.maxFeePerGas) &&
        Objects.equals(this.maxPriorityFeePerGas, ethereumTransactionCompiledResponse.maxPriorityFeePerGas) &&
        Objects.equals(this.nonce, ethereumTransactionCompiledResponse.nonce) &&
        Objects.equals(this.value, ethereumTransactionCompiledResponse.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, data, from, to, gas, maxFeePerGas, maxPriorityFeePerGas, nonce, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthereumTransactionCompiledResponse {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    maxFeePerGas: ").append(toIndentedString(maxFeePerGas)).append("\n");
    sb.append("    maxPriorityFeePerGas: ").append(toIndentedString(maxPriorityFeePerGas)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

