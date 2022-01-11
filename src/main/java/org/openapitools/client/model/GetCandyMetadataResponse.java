/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@theblockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 500 free credits.</b>  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.GetCandyMetadataResponseCreators;

/**
 * GetCandyMetadataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T17:38:57.777416-08:00[America/Los_Angeles]")
public class GetCandyMetadataResponse {
  public static final String SERIALIZED_NAME_AUTHORITY = "authority";
  @SerializedName(SERIALIZED_NAME_AUTHORITY)
  private String authority;

  public static final String SERIALIZED_NAME_BUMP = "bump";
  @SerializedName(SERIALIZED_NAME_BUMP)
  private BigDecimal bump;

  public static final String SERIALIZED_NAME_CANDY_MACHINE_ID = "candy_machine_id";
  @SerializedName(SERIALIZED_NAME_CANDY_MACHINE_ID)
  private String candyMachineId;

  public static final String SERIALIZED_NAME_CONFIG_ADDRESS = "config_address";
  @SerializedName(SERIALIZED_NAME_CONFIG_ADDRESS)
  private String configAddress;

  public static final String SERIALIZED_NAME_CREATORS = "creators";
  @SerializedName(SERIALIZED_NAME_CREATORS)
  private List<GetCandyMetadataResponseCreators> creators = null;

  public static final String SERIALIZED_NAME_GO_LIVE_DATE = "go_live_date";
  @SerializedName(SERIALIZED_NAME_GO_LIVE_DATE)
  private BigDecimal goLiveDate;

  public static final String SERIALIZED_NAME_IS_MUTABLE = "is_mutable";
  @SerializedName(SERIALIZED_NAME_IS_MUTABLE)
  private Boolean isMutable;

  public static final String SERIALIZED_NAME_ITEMS_AVAILABLE = "items_available";
  @SerializedName(SERIALIZED_NAME_ITEMS_AVAILABLE)
  private BigDecimal itemsAvailable;

  public static final String SERIALIZED_NAME_ITEMS_REDEEMED = "items_redeemed";
  @SerializedName(SERIALIZED_NAME_ITEMS_REDEEMED)
  private BigDecimal itemsRedeemed;

  public static final String SERIALIZED_NAME_MAX_NUMBER_OF_LINES = "max_number_of_lines";
  @SerializedName(SERIALIZED_NAME_MAX_NUMBER_OF_LINES)
  private BigDecimal maxNumberOfLines;

  public static final String SERIALIZED_NAME_MAX_SUPPLY = "max_supply";
  @SerializedName(SERIALIZED_NAME_MAX_SUPPLY)
  private BigDecimal maxSupply;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_RETAIN_AUTHORITY = "retain_authority";
  @SerializedName(SERIALIZED_NAME_RETAIN_AUTHORITY)
  private Boolean retainAuthority;

  public static final String SERIALIZED_NAME_SELLER_FEE_BASIS_POINTS = "seller_fee_basis_points";
  @SerializedName(SERIALIZED_NAME_SELLER_FEE_BASIS_POINTS)
  private BigDecimal sellerFeeBasisPoints;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TOKEN_MINT = "token_mint";
  @SerializedName(SERIALIZED_NAME_TOKEN_MINT)
  private String tokenMint;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private String wallet;


  public GetCandyMetadataResponse authority(String authority) {
    
    this.authority = authority;
    return this;
  }

   /**
   * The update authority of the candy machine
   * @return authority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The update authority of the candy machine")

  public String getAuthority() {
    return authority;
  }


  public void setAuthority(String authority) {
    this.authority = authority;
  }


  public GetCandyMetadataResponse bump(BigDecimal bump) {
    
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


  public GetCandyMetadataResponse candyMachineId(String candyMachineId) {
    
    this.candyMachineId = candyMachineId;
    return this;
  }

   /**
   * The ID of the candy machine 
   * @return candyMachineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the candy machine ")

  public String getCandyMachineId() {
    return candyMachineId;
  }


  public void setCandyMachineId(String candyMachineId) {
    this.candyMachineId = candyMachineId;
  }


  public GetCandyMetadataResponse configAddress(String configAddress) {
    
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


  public GetCandyMetadataResponse creators(List<GetCandyMetadataResponseCreators> creators) {
    
    this.creators = creators;
    return this;
  }

  public GetCandyMetadataResponse addCreatorsItem(GetCandyMetadataResponseCreators creatorsItem) {
    if (this.creators == null) {
      this.creators = new ArrayList<GetCandyMetadataResponseCreators>();
    }
    this.creators.add(creatorsItem);
    return this;
  }

   /**
   * Get creators
   * @return creators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetCandyMetadataResponseCreators> getCreators() {
    return creators;
  }


  public void setCreators(List<GetCandyMetadataResponseCreators> creators) {
    this.creators = creators;
  }


  public GetCandyMetadataResponse goLiveDate(BigDecimal goLiveDate) {
    
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


  public GetCandyMetadataResponse isMutable(Boolean isMutable) {
    
    this.isMutable = isMutable;
    return this;
  }

   /**
   * Get isMutable
   * @return isMutable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMutable() {
    return isMutable;
  }


  public void setIsMutable(Boolean isMutable) {
    this.isMutable = isMutable;
  }


  public GetCandyMetadataResponse itemsAvailable(BigDecimal itemsAvailable) {
    
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


  public GetCandyMetadataResponse itemsRedeemed(BigDecimal itemsRedeemed) {
    
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


  public GetCandyMetadataResponse maxNumberOfLines(BigDecimal maxNumberOfLines) {
    
    this.maxNumberOfLines = maxNumberOfLines;
    return this;
  }

   /**
   * Get maxNumberOfLines
   * @return maxNumberOfLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxNumberOfLines() {
    return maxNumberOfLines;
  }


  public void setMaxNumberOfLines(BigDecimal maxNumberOfLines) {
    this.maxNumberOfLines = maxNumberOfLines;
  }


  public GetCandyMetadataResponse maxSupply(BigDecimal maxSupply) {
    
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * Get maxSupply
   * @return maxSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMaxSupply() {
    return maxSupply;
  }


  public void setMaxSupply(BigDecimal maxSupply) {
    this.maxSupply = maxSupply;
  }


  public GetCandyMetadataResponse price(BigDecimal price) {
    
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


  public GetCandyMetadataResponse retainAuthority(Boolean retainAuthority) {
    
    this.retainAuthority = retainAuthority;
    return this;
  }

   /**
   * Get retainAuthority
   * @return retainAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRetainAuthority() {
    return retainAuthority;
  }


  public void setRetainAuthority(Boolean retainAuthority) {
    this.retainAuthority = retainAuthority;
  }


  public GetCandyMetadataResponse sellerFeeBasisPoints(BigDecimal sellerFeeBasisPoints) {
    
    this.sellerFeeBasisPoints = sellerFeeBasisPoints;
    return this;
  }

   /**
   * The royalty the creators receive on each sale after the primary sale (the initial minting) (denominated in basis points (e.g., 75 basis points &#x3D; 0.75%)) 
   * @return sellerFeeBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The royalty the creators receive on each sale after the primary sale (the initial minting) (denominated in basis points (e.g., 75 basis points = 0.75%)) ")

  public BigDecimal getSellerFeeBasisPoints() {
    return sellerFeeBasisPoints;
  }


  public void setSellerFeeBasisPoints(BigDecimal sellerFeeBasisPoints) {
    this.sellerFeeBasisPoints = sellerFeeBasisPoints;
  }


  public GetCandyMetadataResponse symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public GetCandyMetadataResponse tokenMint(String tokenMint) {
    
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


  public GetCandyMetadataResponse uuid(String uuid) {
    
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


  public GetCandyMetadataResponse wallet(String wallet) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCandyMetadataResponse getCandyMetadataResponse = (GetCandyMetadataResponse) o;
    return Objects.equals(this.authority, getCandyMetadataResponse.authority) &&
        Objects.equals(this.bump, getCandyMetadataResponse.bump) &&
        Objects.equals(this.candyMachineId, getCandyMetadataResponse.candyMachineId) &&
        Objects.equals(this.configAddress, getCandyMetadataResponse.configAddress) &&
        Objects.equals(this.creators, getCandyMetadataResponse.creators) &&
        Objects.equals(this.goLiveDate, getCandyMetadataResponse.goLiveDate) &&
        Objects.equals(this.isMutable, getCandyMetadataResponse.isMutable) &&
        Objects.equals(this.itemsAvailable, getCandyMetadataResponse.itemsAvailable) &&
        Objects.equals(this.itemsRedeemed, getCandyMetadataResponse.itemsRedeemed) &&
        Objects.equals(this.maxNumberOfLines, getCandyMetadataResponse.maxNumberOfLines) &&
        Objects.equals(this.maxSupply, getCandyMetadataResponse.maxSupply) &&
        Objects.equals(this.price, getCandyMetadataResponse.price) &&
        Objects.equals(this.retainAuthority, getCandyMetadataResponse.retainAuthority) &&
        Objects.equals(this.sellerFeeBasisPoints, getCandyMetadataResponse.sellerFeeBasisPoints) &&
        Objects.equals(this.symbol, getCandyMetadataResponse.symbol) &&
        Objects.equals(this.tokenMint, getCandyMetadataResponse.tokenMint) &&
        Objects.equals(this.uuid, getCandyMetadataResponse.uuid) &&
        Objects.equals(this.wallet, getCandyMetadataResponse.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, bump, candyMachineId, configAddress, creators, goLiveDate, isMutable, itemsAvailable, itemsRedeemed, maxNumberOfLines, maxSupply, price, retainAuthority, sellerFeeBasisPoints, symbol, tokenMint, uuid, wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCandyMetadataResponse {\n");
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    bump: ").append(toIndentedString(bump)).append("\n");
    sb.append("    candyMachineId: ").append(toIndentedString(candyMachineId)).append("\n");
    sb.append("    configAddress: ").append(toIndentedString(configAddress)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    goLiveDate: ").append(toIndentedString(goLiveDate)).append("\n");
    sb.append("    isMutable: ").append(toIndentedString(isMutable)).append("\n");
    sb.append("    itemsAvailable: ").append(toIndentedString(itemsAvailable)).append("\n");
    sb.append("    itemsRedeemed: ").append(toIndentedString(itemsRedeemed)).append("\n");
    sb.append("    maxNumberOfLines: ").append(toIndentedString(maxNumberOfLines)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    retainAuthority: ").append(toIndentedString(retainAuthority)).append("\n");
    sb.append("    sellerFeeBasisPoints: ").append(toIndentedString(sellerFeeBasisPoints)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tokenMint: ").append(toIndentedString(tokenMint)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

