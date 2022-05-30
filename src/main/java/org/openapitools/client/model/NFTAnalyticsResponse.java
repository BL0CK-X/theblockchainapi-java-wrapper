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
import org.openapitools.client.model.NFTAnalyticsResponseTransactionHistory;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * NFTAnalyticsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-26T09:40:45.678369-07:00[America/Los_Angeles]")
public class NFTAnalyticsResponse {
  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Object startTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Object endTime = null;

  public static final String SERIALIZED_NAME_TRANSACTION_HISTORY = "transaction_history";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HISTORY)
  private NFTAnalyticsResponseTransactionHistory transactionHistory;

  public static final String SERIALIZED_NAME_FLOOR = "floor";
  @SerializedName(SERIALIZED_NAME_FLOOR)
  private BigDecimal floor;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private BigDecimal volume;

  public NFTAnalyticsResponse() { 
  }

  public NFTAnalyticsResponse startTime(Object startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time used in the API request. 
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start time used in the API request. ")

  public Object getStartTime() {
    return startTime;
  }


  public void setStartTime(Object startTime) {
    this.startTime = startTime;
  }


  public NFTAnalyticsResponse endTime(Object endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time used in the API request.  
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end time used in the API request.  ")

  public Object getEndTime() {
    return endTime;
  }


  public void setEndTime(Object endTime) {
    this.endTime = endTime;
  }


  public NFTAnalyticsResponse transactionHistory(NFTAnalyticsResponseTransactionHistory transactionHistory) {
    
    this.transactionHistory = transactionHistory;
    return this;
  }

   /**
   * Get transactionHistory
   * @return transactionHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NFTAnalyticsResponseTransactionHistory getTransactionHistory() {
    return transactionHistory;
  }


  public void setTransactionHistory(NFTAnalyticsResponseTransactionHistory transactionHistory) {
    this.transactionHistory = transactionHistory;
  }


  public NFTAnalyticsResponse floor(BigDecimal floor) {
    
    this.floor = floor;
    return this;
  }

   /**
   * The minimum active listing price for the collection in the given time period. The listing must have been processed before &#x60;end_time&#x60; and still active (not delisted or purchased) by &#x60;end_time&#x60; in order to affect the floor calculation. 
   * @return floor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1644964713", value = "The minimum active listing price for the collection in the given time period. The listing must have been processed before `end_time` and still active (not delisted or purchased) by `end_time` in order to affect the floor calculation. ")

  public BigDecimal getFloor() {
    return floor;
  }


  public void setFloor(BigDecimal floor) {
    this.floor = floor;
  }


  public NFTAnalyticsResponse volume(BigDecimal volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * The sum of the sale prices for the given time period. 
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1644964713", value = "The sum of the sale prices for the given time period. ")

  public BigDecimal getVolume() {
    return volume;
  }


  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFTAnalyticsResponse nfTAnalyticsResponse = (NFTAnalyticsResponse) o;
    return Objects.equals(this.startTime, nfTAnalyticsResponse.startTime) &&
        Objects.equals(this.endTime, nfTAnalyticsResponse.endTime) &&
        Objects.equals(this.transactionHistory, nfTAnalyticsResponse.transactionHistory) &&
        Objects.equals(this.floor, nfTAnalyticsResponse.floor) &&
        Objects.equals(this.volume, nfTAnalyticsResponse.volume);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, transactionHistory, floor, volume);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTAnalyticsResponse {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    transactionHistory: ").append(toIndentedString(transactionHistory)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

