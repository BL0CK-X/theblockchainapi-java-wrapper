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
 * GeneralBalanceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T09:58:36.085380-07:00[America/Los_Angeles]")
public class GeneralBalanceResponse {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_INTEGER_BALANCE = "integer_balance";
  @SerializedName(SERIALIZED_NAME_INTEGER_BALANCE)
  private BigDecimal integerBalance;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private BigDecimal decimals;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public GeneralBalanceResponse() { 
  }

  public GeneralBalanceResponse balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * The balance of the token in the wallet 
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The balance of the token in the wallet ")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public GeneralBalanceResponse integerBalance(BigDecimal integerBalance) {
    
    this.integerBalance = integerBalance;
    return this;
  }

   /**
   * Not included if retreiving native token (e.g., SOL, ETH, BNB, etc.) balance 
   * @return integerBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not included if retreiving native token (e.g., SOL, ETH, BNB, etc.) balance ")

  public BigDecimal getIntegerBalance() {
    return integerBalance;
  }


  public void setIntegerBalance(BigDecimal integerBalance) {
    this.integerBalance = integerBalance;
  }


  public GeneralBalanceResponse decimals(BigDecimal decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Not included if retreiving native token (e.g., SOL, ETH, BNB, etc.) balance. 
   * @return decimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not included if retreiving native token (e.g., SOL, ETH, BNB, etc.) balance. ")

  public BigDecimal getDecimals() {
    return decimals;
  }


  public void setDecimals(BigDecimal decimals) {
    this.decimals = decimals;
  }


  public GeneralBalanceResponse network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60;
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public GeneralBalanceResponse unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Not included if retreiving a token / NFT balance 
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not included if retreiving a token / NFT balance ")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralBalanceResponse generalBalanceResponse = (GeneralBalanceResponse) o;
    return Objects.equals(this.balance, generalBalanceResponse.balance) &&
        Objects.equals(this.integerBalance, generalBalanceResponse.integerBalance) &&
        Objects.equals(this.decimals, generalBalanceResponse.decimals) &&
        Objects.equals(this.network, generalBalanceResponse.network) &&
        Objects.equals(this.unit, generalBalanceResponse.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, integerBalance, decimals, network, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralBalanceResponse {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    integerBalance: ").append(toIndentedString(integerBalance)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

