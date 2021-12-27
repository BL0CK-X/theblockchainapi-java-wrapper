/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.theblockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@theblockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@theblockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@theblockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 500 free credits.</b>  You can learn more about our pricing <a href=\"https://dashboard.theblockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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
import java.util.ArrayList;
import java.util.List;

/**
 * NFTData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T08:10:20.407381-08:00[America/Los_Angeles]")
public class NFTData {
  public static final String SERIALIZED_NAME_CREATORS = "creators";
  @SerializedName(SERIALIZED_NAME_CREATORS)
  private List<String> creators = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private List<Float> share = null;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private List<Integer> verified = null;


  public NFTData creators(List<String> creators) {
    
    this.creators = creators;
    return this;
  }

  public NFTData addCreatorsItem(String creatorsItem) {
    if (this.creators == null) {
      this.creators = new ArrayList<String>();
    }
    this.creators.add(creatorsItem);
    return this;
  }

   /**
   * The creators of the NFT 
   * @return creators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creators of the NFT ")

  public List<String> getCreators() {
    return creators;
  }


  public void setCreators(List<String> creators) {
    this.creators = creators;
  }


  public NFTData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the NFT 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the NFT ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NFTData share(List<Float> share) {
    
    this.share = share;
    return this;
  }

  public NFTData addShareItem(Float shareItem) {
    if (this.share == null) {
      this.share = new ArrayList<Float>();
    }
    this.share.add(shareItem);
    return this;
  }

   /**
   * The portion of the seller fee that each creator receives. Index 0 corresponds to creator at index 0 in the creator array, and so on. Length of share array must be the same as the length of the creator array. 
   * @return share
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The portion of the seller fee that each creator receives. Index 0 corresponds to creator at index 0 in the creator array, and so on. Length of share array must be the same as the length of the creator array. ")

  public List<Float> getShare() {
    return share;
  }


  public void setShare(List<Float> share) {
    this.share = share;
  }


  public NFTData symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the NFT 
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the NFT ")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public NFTData uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the NFT 
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI of the NFT ")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public NFTData verified(List<Integer> verified) {
    
    this.verified = verified;
    return this;
  }

  public NFTData addVerifiedItem(Integer verifiedItem) {
    if (this.verified == null) {
      this.verified = new ArrayList<Integer>();
    }
    this.verified.add(verifiedItem);
    return this;
  }

   /**
   * Whether or not the respective creator has signed the minting transaction of the NFT. Index 0 corresponds to creator at index 0 in the creator array, and so on. Length of verified array must be the same as the length of the creator array. 
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the respective creator has signed the minting transaction of the NFT. Index 0 corresponds to creator at index 0 in the creator array, and so on. Length of verified array must be the same as the length of the creator array. ")

  public List<Integer> getVerified() {
    return verified;
  }


  public void setVerified(List<Integer> verified) {
    this.verified = verified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFTData nfTData = (NFTData) o;
    return Objects.equals(this.creators, nfTData.creators) &&
        Objects.equals(this.name, nfTData.name) &&
        Objects.equals(this.share, nfTData.share) &&
        Objects.equals(this.symbol, nfTData.symbol) &&
        Objects.equals(this.uri, nfTData.uri) &&
        Objects.equals(this.verified, nfTData.verified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creators, name, share, symbol, uri, verified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTData {\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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

