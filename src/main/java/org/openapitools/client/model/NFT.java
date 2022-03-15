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
import org.openapitools.client.model.NFTData;

/**
 * NFT
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T12:06:18.396945-07:00[America/Los_Angeles]")
public class NFT {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private NFTData data;

  public static final String SERIALIZED_NAME_IS_MUTABLE = "is_mutable";
  @SerializedName(SERIALIZED_NAME_IS_MUTABLE)
  private Boolean isMutable;

  public static final String SERIALIZED_NAME_MINT = "mint";
  @SerializedName(SERIALIZED_NAME_MINT)
  private String mint;

  public static final String SERIALIZED_NAME_PRIMARY_SALE_HAPPENED = "primary_sale_happened";
  @SerializedName(SERIALIZED_NAME_PRIMARY_SALE_HAPPENED)
  private Boolean primarySaleHappened;

  public static final String SERIALIZED_NAME_UPDATE_AUTHORITY = "update_authority";
  @SerializedName(SERIALIZED_NAME_UPDATE_AUTHORITY)
  private String updateAuthority;

  public static final String SERIALIZED_NAME_SELLER_FEE_BASIS_POINTS = "seller_fee_basis_points";
  @SerializedName(SERIALIZED_NAME_SELLER_FEE_BASIS_POINTS)
  private BigDecimal sellerFeeBasisPoints;

  public static final String SERIALIZED_NAME_MINT_SECRET_RECOVERY_PHRASE = "mint_secret_recovery_phrase";
  @SerializedName(SERIALIZED_NAME_MINT_SECRET_RECOVERY_PHRASE)
  private String mintSecretRecoveryPhrase;

  public static final String SERIALIZED_NAME_EXPLORER_URL = "explorer_url";
  @SerializedName(SERIALIZED_NAME_EXPLORER_URL)
  private String explorerUrl;


  public NFT data(NFTData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NFTData getData() {
    return data;
  }


  public void setData(NFTData data) {
    this.data = data;
  }


  public NFT isMutable(Boolean isMutable) {
    
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


  public NFT mint(String mint) {
    
    this.mint = mint;
    return this;
  }

   /**
   * The public key address of the NFT 
   * @return mint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key address of the NFT ")

  public String getMint() {
    return mint;
  }


  public void setMint(String mint) {
    this.mint = mint;
  }


  public NFT primarySaleHappened(Boolean primarySaleHappened) {
    
    this.primarySaleHappened = primarySaleHappened;
    return this;
  }

   /**
   * Get primarySaleHappened
   * @return primarySaleHappened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrimarySaleHappened() {
    return primarySaleHappened;
  }


  public void setPrimarySaleHappened(Boolean primarySaleHappened) {
    this.primarySaleHappened = primarySaleHappened;
  }


  public NFT updateAuthority(String updateAuthority) {
    
    this.updateAuthority = updateAuthority;
    return this;
  }

   /**
   * A public key address that is usually that of the person who minted the NFT 
   * @return updateAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A public key address that is usually that of the person who minted the NFT ")

  public String getUpdateAuthority() {
    return updateAuthority;
  }


  public void setUpdateAuthority(String updateAuthority) {
    this.updateAuthority = updateAuthority;
  }


  public NFT sellerFeeBasisPoints(BigDecimal sellerFeeBasisPoints) {
    
    this.sellerFeeBasisPoints = sellerFeeBasisPoints;
    return this;
  }

   /**
   * Get sellerFeeBasisPoints
   * @return sellerFeeBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getSellerFeeBasisPoints() {
    return sellerFeeBasisPoints;
  }


  public void setSellerFeeBasisPoints(BigDecimal sellerFeeBasisPoints) {
    this.sellerFeeBasisPoints = sellerFeeBasisPoints;
  }


  public NFT mintSecretRecoveryPhrase(String mintSecretRecoveryPhrase) {
    
    this.mintSecretRecoveryPhrase = mintSecretRecoveryPhrase;
    return this;
  }

   /**
   * Get mintSecretRecoveryPhrase
   * @return mintSecretRecoveryPhrase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMintSecretRecoveryPhrase() {
    return mintSecretRecoveryPhrase;
  }


  public void setMintSecretRecoveryPhrase(String mintSecretRecoveryPhrase) {
    this.mintSecretRecoveryPhrase = mintSecretRecoveryPhrase;
  }


  public NFT explorerUrl(String explorerUrl) {
    
    this.explorerUrl = explorerUrl;
    return this;
  }

   /**
   * Get explorerUrl
   * @return explorerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExplorerUrl() {
    return explorerUrl;
  }


  public void setExplorerUrl(String explorerUrl) {
    this.explorerUrl = explorerUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFT NFT = (NFT) o;
    return Objects.equals(this.data, NFT.data) &&
        Objects.equals(this.isMutable, NFT.isMutable) &&
        Objects.equals(this.mint, NFT.mint) &&
        Objects.equals(this.primarySaleHappened, NFT.primarySaleHappened) &&
        Objects.equals(this.updateAuthority, NFT.updateAuthority) &&
        Objects.equals(this.sellerFeeBasisPoints, NFT.sellerFeeBasisPoints) &&
        Objects.equals(this.mintSecretRecoveryPhrase, NFT.mintSecretRecoveryPhrase) &&
        Objects.equals(this.explorerUrl, NFT.explorerUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, isMutable, mint, primarySaleHappened, updateAuthority, sellerFeeBasisPoints, mintSecretRecoveryPhrase, explorerUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFT {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isMutable: ").append(toIndentedString(isMutable)).append("\n");
    sb.append("    mint: ").append(toIndentedString(mint)).append("\n");
    sb.append("    primarySaleHappened: ").append(toIndentedString(primarySaleHappened)).append("\n");
    sb.append("    updateAuthority: ").append(toIndentedString(updateAuthority)).append("\n");
    sb.append("    sellerFeeBasisPoints: ").append(toIndentedString(sellerFeeBasisPoints)).append("\n");
    sb.append("    mintSecretRecoveryPhrase: ").append(toIndentedString(mintSecretRecoveryPhrase)).append("\n");
    sb.append("    explorerUrl: ").append(toIndentedString(explorerUrl)).append("\n");
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

