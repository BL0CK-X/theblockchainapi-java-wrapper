/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.theblockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@theblockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@theblockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@theblockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 500 free credits every month.</b>  You can learn more about our pricing <a href=\"https://dashboard.theblockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/javascript\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/go\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/java\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/go\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/go\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/go\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/tree/main/go\" target = \"_blank\">TypeScript</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
 *
 * The version of the OpenAPI document: null
 * Contact: info@theblockchainapi.com
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
 * GetCandyDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-05T17:25:06.876284-08:00[America/Los_Angeles]")
public class GetCandyDetailsResponse {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_GO_LIVE_DATE = "go_live_date";
  @SerializedName(SERIALIZED_NAME_GO_LIVE_DATE)
  private BigDecimal goLiveDate;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_ITEMS_AVAILABLE = "items_available";
  @SerializedName(SERIALIZED_NAME_ITEMS_AVAILABLE)
  private BigDecimal itemsAvailable;

  public static final String SERIALIZED_NAME_ITEMS_REDEEMED = "items_redeemed";
  @SerializedName(SERIALIZED_NAME_ITEMS_REDEEMED)
  private BigDecimal itemsRedeemed;

  public static final String SERIALIZED_NAME_TOKEN_MINT = "token_mint";
  @SerializedName(SERIALIZED_NAME_TOKEN_MINT)
  private String tokenMint;

  public static final String SERIALIZED_NAME_CONFIG_ADDRESS = "config_address";
  @SerializedName(SERIALIZED_NAME_CONFIG_ADDRESS)
  private String configAddress;

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private String wallet;

  public static final String SERIALIZED_NAME_BUMP = "bump";
  @SerializedName(SERIALIZED_NAME_BUMP)
  private BigDecimal bump;


  public GetCandyDetailsResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The uuid of the candy machine
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The uuid of the candy machine")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public GetCandyDetailsResponse goLiveDate(BigDecimal goLiveDate) {
    
    this.goLiveDate = goLiveDate;
    return this;
  }

   /**
   * The unix timestamp of the start date of the candy machine 
   * @return goLiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unix timestamp of the start date of the candy machine ")

  public BigDecimal getGoLiveDate() {
    return goLiveDate;
  }


  public void setGoLiveDate(BigDecimal goLiveDate) {
    this.goLiveDate = goLiveDate;
  }


  public GetCandyDetailsResponse price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price in Lamports for minting an NFT from the candy machine. 1e9 Lamport  &#x3D; 1 SOL 
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price in Lamports for minting an NFT from the candy machine. 1e9 Lamport  = 1 SOL ")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public GetCandyDetailsResponse itemsAvailable(BigDecimal itemsAvailable) {
    
    this.itemsAvailable = itemsAvailable;
    return this;
  }

   /**
   * The number of NFTs available for mint from the candy machine 
   * @return itemsAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of NFTs available for mint from the candy machine ")

  public BigDecimal getItemsAvailable() {
    return itemsAvailable;
  }


  public void setItemsAvailable(BigDecimal itemsAvailable) {
    this.itemsAvailable = itemsAvailable;
  }


  public GetCandyDetailsResponse itemsRedeemed(BigDecimal itemsRedeemed) {
    
    this.itemsRedeemed = itemsRedeemed;
    return this;
  }

   /**
   * The number of NFTs minted already from the candy machine 
   * @return itemsRedeemed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of NFTs minted already from the candy machine ")

  public BigDecimal getItemsRedeemed() {
    return itemsRedeemed;
  }


  public void setItemsRedeemed(BigDecimal itemsRedeemed) {
    this.itemsRedeemed = itemsRedeemed;
  }


  public GetCandyDetailsResponse tokenMint(String tokenMint) {
    
    this.tokenMint = tokenMint;
    return this;
  }

   /**
   * Get tokenMint
   * @return tokenMint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTokenMint() {
    return tokenMint;
  }


  public void setTokenMint(String tokenMint) {
    this.tokenMint = tokenMint;
  }


  public GetCandyDetailsResponse configAddress(String configAddress) {
    
    this.configAddress = configAddress;
    return this;
  }

   /**
   * The configuration public key address of the candy machine 
   * @return configAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The configuration public key address of the candy machine ")

  public String getConfigAddress() {
    return configAddress;
  }


  public void setConfigAddress(String configAddress) {
    this.configAddress = configAddress;
  }


  public GetCandyDetailsResponse wallet(String wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * The public key address of the wallet that recevies the proceeds from NFT mints 
   * @return wallet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key address of the wallet that recevies the proceeds from NFT mints ")

  public String getWallet() {
    return wallet;
  }


  public void setWallet(String wallet) {
    this.wallet = wallet;
  }


  public GetCandyDetailsResponse bump(BigDecimal bump) {
    
    this.bump = bump;
    return this;
  }

   /**
   * Get bump
   * @return bump
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBump() {
    return bump;
  }


  public void setBump(BigDecimal bump) {
    this.bump = bump;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCandyDetailsResponse getCandyDetailsResponse = (GetCandyDetailsResponse) o;
    return Objects.equals(this.uuid, getCandyDetailsResponse.uuid) &&
        Objects.equals(this.goLiveDate, getCandyDetailsResponse.goLiveDate) &&
        Objects.equals(this.price, getCandyDetailsResponse.price) &&
        Objects.equals(this.itemsAvailable, getCandyDetailsResponse.itemsAvailable) &&
        Objects.equals(this.itemsRedeemed, getCandyDetailsResponse.itemsRedeemed) &&
        Objects.equals(this.tokenMint, getCandyDetailsResponse.tokenMint) &&
        Objects.equals(this.configAddress, getCandyDetailsResponse.configAddress) &&
        Objects.equals(this.wallet, getCandyDetailsResponse.wallet) &&
        Objects.equals(this.bump, getCandyDetailsResponse.bump);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, goLiveDate, price, itemsAvailable, itemsRedeemed, tokenMint, configAddress, wallet, bump);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCandyDetailsResponse {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    goLiveDate: ").append(toIndentedString(goLiveDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    itemsAvailable: ").append(toIndentedString(itemsAvailable)).append("\n");
    sb.append("    itemsRedeemed: ").append(toIndentedString(itemsRedeemed)).append("\n");
    sb.append("    tokenMint: ").append(toIndentedString(tokenMint)).append("\n");
    sb.append("    configAddress: ").append(toIndentedString(configAddress)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    bump: ").append(toIndentedString(bump)).append("\n");
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

