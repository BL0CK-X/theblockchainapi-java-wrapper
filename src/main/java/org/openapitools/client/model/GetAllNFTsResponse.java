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
import org.openapitools.client.model.GetAllNFTsResponseMintedNfts;
import org.openapitools.client.model.GetAllNFTsResponseUnmintedNfts;

/**
 * GetAllNFTsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T08:36:20.342797-08:00[America/Los_Angeles]")
public class GetAllNFTsResponse {
  public static final String SERIALIZED_NAME_MINTED_NFTS = "minted_nfts";
  @SerializedName(SERIALIZED_NAME_MINTED_NFTS)
  private List<GetAllNFTsResponseMintedNfts> mintedNfts = null;

  public static final String SERIALIZED_NAME_UNMINTED_NFTS = "unminted_nfts";
  @SerializedName(SERIALIZED_NAME_UNMINTED_NFTS)
  private List<GetAllNFTsResponseUnmintedNfts> unmintedNfts = null;

  public static final String SERIALIZED_NAME_ALL_NFTS = "all_nfts";
  @SerializedName(SERIALIZED_NAME_ALL_NFTS)
  private List<GetAllNFTsResponseUnmintedNfts> allNfts = null;


  public GetAllNFTsResponse mintedNfts(List<GetAllNFTsResponseMintedNfts> mintedNfts) {
    
    this.mintedNfts = mintedNfts;
    return this;
  }

  public GetAllNFTsResponse addMintedNftsItem(GetAllNFTsResponseMintedNfts mintedNftsItem) {
    if (this.mintedNfts == null) {
      this.mintedNfts = new ArrayList<GetAllNFTsResponseMintedNfts>();
    }
    this.mintedNfts.add(mintedNftsItem);
    return this;
  }

   /**
   * The minted NFTs. Only filled in for &#x60;v1&#x60; candy machines. Left empty for &#x60;v2&#x60;.
   * @return mintedNfts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minted NFTs. Only filled in for `v1` candy machines. Left empty for `v2`.")

  public List<GetAllNFTsResponseMintedNfts> getMintedNfts() {
    return mintedNfts;
  }


  public void setMintedNfts(List<GetAllNFTsResponseMintedNfts> mintedNfts) {
    this.mintedNfts = mintedNfts;
  }


  public GetAllNFTsResponse unmintedNfts(List<GetAllNFTsResponseUnmintedNfts> unmintedNfts) {
    
    this.unmintedNfts = unmintedNfts;
    return this;
  }

  public GetAllNFTsResponse addUnmintedNftsItem(GetAllNFTsResponseUnmintedNfts unmintedNftsItem) {
    if (this.unmintedNfts == null) {
      this.unmintedNfts = new ArrayList<GetAllNFTsResponseUnmintedNfts>();
    }
    this.unmintedNfts.add(unmintedNftsItem);
    return this;
  }

   /**
   * The unminted NFTs. Only filled in for &#x60;v1&#x60; candy machines. Left empty for &#x60;v2&#x60;.
   * @return unmintedNfts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unminted NFTs. Only filled in for `v1` candy machines. Left empty for `v2`.")

  public List<GetAllNFTsResponseUnmintedNfts> getUnmintedNfts() {
    return unmintedNfts;
  }


  public void setUnmintedNfts(List<GetAllNFTsResponseUnmintedNfts> unmintedNfts) {
    this.unmintedNfts = unmintedNfts;
  }


  public GetAllNFTsResponse allNfts(List<GetAllNFTsResponseUnmintedNfts> allNfts) {
    
    this.allNfts = allNfts;
    return this;
  }

  public GetAllNFTsResponse addAllNftsItem(GetAllNFTsResponseUnmintedNfts allNftsItem) {
    if (this.allNfts == null) {
      this.allNfts = new ArrayList<GetAllNFTsResponseUnmintedNfts>();
    }
    this.allNfts.add(allNftsItem);
    return this;
  }

   /**
   * The list of all NFTs. Filled in for both &#x60;v1&#x60; and &#x60;v2&#x60; NFTs.
   * @return allNfts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of all NFTs. Filled in for both `v1` and `v2` NFTs.")

  public List<GetAllNFTsResponseUnmintedNfts> getAllNfts() {
    return allNfts;
  }


  public void setAllNfts(List<GetAllNFTsResponseUnmintedNfts> allNfts) {
    this.allNfts = allNfts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllNFTsResponse getAllNFTsResponse = (GetAllNFTsResponse) o;
    return Objects.equals(this.mintedNfts, getAllNFTsResponse.mintedNfts) &&
        Objects.equals(this.unmintedNfts, getAllNFTsResponse.unmintedNfts) &&
        Objects.equals(this.allNfts, getAllNFTsResponse.allNfts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mintedNfts, unmintedNfts, allNfts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllNFTsResponse {\n");
    sb.append("    mintedNfts: ").append(toIndentedString(mintedNfts)).append("\n");
    sb.append("    unmintedNfts: ").append(toIndentedString(unmintedNfts)).append("\n");
    sb.append("    allNfts: ").append(toIndentedString(allNfts)).append("\n");
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

