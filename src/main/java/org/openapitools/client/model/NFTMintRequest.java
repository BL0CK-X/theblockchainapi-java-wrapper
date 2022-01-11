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
import org.openapitools.client.model.Wallet;

/**
 * NFTMintRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T17:38:57.777416-08:00[America/Los_Angeles]")
public class NFTMintRequest {
  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private Wallet wallet;

  public static final String SERIALIZED_NAME_NFT_NAME = "nft_name";
  @SerializedName(SERIALIZED_NAME_NFT_NAME)
  private String nftName = "";

  public static final String SERIALIZED_NAME_NFT_SYMBOL = "nft_symbol";
  @SerializedName(SERIALIZED_NAME_NFT_SYMBOL)
  private String nftSymbol = "";

  public static final String SERIALIZED_NAME_NFT_DESCRIPTION = "nft_description";
  @SerializedName(SERIALIZED_NAME_NFT_DESCRIPTION)
  private String nftDescription = "";

  public static final String SERIALIZED_NAME_NFT_URL = "nft_url";
  @SerializedName(SERIALIZED_NAME_NFT_URL)
  private String nftUrl = "";

  public static final String SERIALIZED_NAME_NFT_METADATA = "nft_metadata";
  @SerializedName(SERIALIZED_NAME_NFT_METADATA)
  private String nftMetadata = "{}";

  /**
   * When you choose S3, all of the nft_description, nft_name, nft_symbol, nft_metadata, and nft_url are put into a json dictionary and uploaded to S3 as a text file.  This is uploaded to an AWS S3 bucket we own, and is an option we provide at no charge. The S3 link to this file is stored on the NFT on the blockchain.   When you choose LINK, the nft_url you provide is stored on the blockchain, and the nft_metadata and nft_description are ignored and not stored anywhere. S3 is then NOT used. 
   */
  @JsonAdapter(NftUploadMethodEnum.Adapter.class)
  public enum NftUploadMethodEnum {
    S3("S3"),
    
    LINK("LINK");

    private String value;

    NftUploadMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NftUploadMethodEnum fromValue(String value) {
      for (NftUploadMethodEnum b : NftUploadMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NftUploadMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NftUploadMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NftUploadMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NftUploadMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NFT_UPLOAD_METHOD = "nft_upload_method";
  @SerializedName(SERIALIZED_NAME_NFT_UPLOAD_METHOD)
  private NftUploadMethodEnum nftUploadMethod = NftUploadMethodEnum.S3;

  public static final String SERIALIZED_NAME_IS_MUTABLE = "is_mutable";
  @SerializedName(SERIALIZED_NAME_IS_MUTABLE)
  private Boolean isMutable = true;

  public static final String SERIALIZED_NAME_IS_MASTER_EDITION = "is_master_edition";
  @SerializedName(SERIALIZED_NAME_IS_MASTER_EDITION)
  private Boolean isMasterEdition = true;

  public static final String SERIALIZED_NAME_SELLER_FEE_BASIS_POINTS = "seller_fee_basis_points";
  @SerializedName(SERIALIZED_NAME_SELLER_FEE_BASIS_POINTS)
  private BigDecimal sellerFeeBasisPoints = new BigDecimal("0");

  public static final String SERIALIZED_NAME_CREATORS = "creators";
  @SerializedName(SERIALIZED_NAME_CREATORS)
  private List<String> creators = null;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private List<Integer> share = null;

  public static final String SERIALIZED_NAME_MINT_TO_PUBLIC_KEY = "mint_to_public_key";
  @SerializedName(SERIALIZED_NAME_MINT_TO_PUBLIC_KEY)
  private String mintToPublicKey = "The public key of the wallet provided";

  /**
   * This determines which network you choose to run the API calls on. We recommend first testing on the devnet, because minting an NFT costs a little above 0.01 SOL, which is about $1.60 at the time of this writing.  When you run on the mainnet-beta, each successful call will deduct approximately that much. When you run on the devnet, that amount is deducted from a simulated amount, so you are not paying with real SOL. To get SOL on the devnet,   airdrop SOL to this address using the CLI. Keep in mind that you can only do this every so often. If you are rate-limited, consider using a VPN and trying again, or just waiting. To get SOL on the mainnet-beta, you    must transfer real SOL to this account from another wallet (e.g., from another wallet you own, from an exchange, etc.). We hope to make this process easier in the future, and if you have any suggestions, please add them    as an issue on our &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api\&quot; target&#x3D;\&quot;_blank\&quot;&gt;GitHub repository&lt;/a&gt; for the API. To get a fee estimate, make a GET requests to the &lt;a href&#x3D;\&quot;#tag/Solana-NFT/paths/~1solana~1nft~1mint~1fee/get\&quot;&gt;v1/solana/nft/mint/fee endpoint&lt;/a&gt; (details in sidebar). 
   */
  @JsonAdapter(NetworkEnum.Adapter.class)
  public enum NetworkEnum {
    DEVNET("devnet"),
    
    MAINNET_BETA("mainnet-beta");

    private String value;

    NetworkEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetworkEnum fromValue(String value) {
      for (NetworkEnum b : NetworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NetworkEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NetworkEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private NetworkEnum network = NetworkEnum.DEVNET;


  public NFTMintRequest wallet(Wallet wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Wallet getWallet() {
    return wallet;
  }


  public void setWallet(Wallet wallet) {
    this.wallet = wallet;
  }


  public NFTMintRequest nftName(String nftName) {
    
    this.nftName = nftName;
    return this;
  }

   /**
   * The name of the token. Limited to 32 characters. Stored on the blockchain.
   * @return nftName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the token. Limited to 32 characters. Stored on the blockchain.")

  public String getNftName() {
    return nftName;
  }


  public void setNftName(String nftName) {
    this.nftName = nftName;
  }


  public NFTMintRequest nftSymbol(String nftSymbol) {
    
    this.nftSymbol = nftSymbol;
    return this;
  }

   /**
   * The symbol of the token. Limited to 10 characters. Stored on the blockchain.
   * @return nftSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the token. Limited to 10 characters. Stored on the blockchain.")

  public String getNftSymbol() {
    return nftSymbol;
  }


  public void setNftSymbol(String nftSymbol) {
    this.nftSymbol = nftSymbol;
  }


  public NFTMintRequest nftDescription(String nftDescription) {
    
    this.nftDescription = nftDescription;
    return this;
  }

   /**
   * The description of the token. Limited to 2000 characters. Not stored on the blockchain.  This is stored in S3 in a bucket we own, and the link to that file is stored on the blockchain.  If you provide your own link, the link is also stored in that S3 file, which is publicly accessible. However, if you choose the NFT upload method \&quot;LINK\&quot; instead of \&quot;S3\&quot;, then we upload the link you  provide for nft_url directly to the blockchain, and S3 is not used at all. Thus, when you provide the \&quot;LINK\&quot; option, the value nft_description is ignored and not used. The Metaplex API does not provide functionality to store any data about your NFT besides a URL. 
   * @return nftDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the token. Limited to 2000 characters. Not stored on the blockchain.  This is stored in S3 in a bucket we own, and the link to that file is stored on the blockchain.  If you provide your own link, the link is also stored in that S3 file, which is publicly accessible. However, if you choose the NFT upload method \"LINK\" instead of \"S3\", then we upload the link you  provide for nft_url directly to the blockchain, and S3 is not used at all. Thus, when you provide the \"LINK\" option, the value nft_description is ignored and not used. The Metaplex API does not provide functionality to store any data about your NFT besides a URL. ")

  public String getNftDescription() {
    return nftDescription;
  }


  public void setNftDescription(String nftDescription) {
    this.nftDescription = nftDescription;
  }


  public NFTMintRequest nftUrl(String nftUrl) {
    
    this.nftUrl = nftUrl;
    return this;
  }

   /**
   * The URL you provided. Limited to 200 characters. This does not need to be a valid URL. Whether or not this is  stored on the blockchain depends on which upload method you choose. If you choose LINK, then this is stored on the  blockchain directly. If you choose S3, then this link is embedded in a public S3 text file that also contains the metadata, the name,  the symbol, and the description of the NFT. 
   * @return nftUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL you provided. Limited to 200 characters. This does not need to be a valid URL. Whether or not this is  stored on the blockchain depends on which upload method you choose. If you choose LINK, then this is stored on the  blockchain directly. If you choose S3, then this link is embedded in a public S3 text file that also contains the metadata, the name,  the symbol, and the description of the NFT. ")

  public String getNftUrl() {
    return nftUrl;
  }


  public void setNftUrl(String nftUrl) {
    this.nftUrl = nftUrl;
  }


  public NFTMintRequest nftMetadata(String nftMetadata) {
    
    this.nftMetadata = nftMetadata;
    return this;
  }

   /**
   * Any data you provide. Must be a string and properly encoded json. Will be viewable on S3. Limited to 2000 bytes. Not stored on the blockchain.  This is stored in S3 in a bucket we own, and the link to that file is stored on the blockchain.  If you provide your own link, the link is also stored in that S3 file, which is publicly accessible. However, if you choose the NFT upload method \&quot;LINK\&quot; instead of \&quot;S3\&quot;, then we upload the link you  provide for nft_url directly to the blockchain, and S3 is not used at all. Thus, when you provide the \&quot;LINK\&quot; option, the value nft_metadata is ignored and not used. The Metaplex API does not provide functionality to store any data about your NFT besides a URL. 
   * @return nftMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any data you provide. Must be a string and properly encoded json. Will be viewable on S3. Limited to 2000 bytes. Not stored on the blockchain.  This is stored in S3 in a bucket we own, and the link to that file is stored on the blockchain.  If you provide your own link, the link is also stored in that S3 file, which is publicly accessible. However, if you choose the NFT upload method \"LINK\" instead of \"S3\", then we upload the link you  provide for nft_url directly to the blockchain, and S3 is not used at all. Thus, when you provide the \"LINK\" option, the value nft_metadata is ignored and not used. The Metaplex API does not provide functionality to store any data about your NFT besides a URL. ")

  public String getNftMetadata() {
    return nftMetadata;
  }


  public void setNftMetadata(String nftMetadata) {
    this.nftMetadata = nftMetadata;
  }


  public NFTMintRequest nftUploadMethod(NftUploadMethodEnum nftUploadMethod) {
    
    this.nftUploadMethod = nftUploadMethod;
    return this;
  }

   /**
   * When you choose S3, all of the nft_description, nft_name, nft_symbol, nft_metadata, and nft_url are put into a json dictionary and uploaded to S3 as a text file.  This is uploaded to an AWS S3 bucket we own, and is an option we provide at no charge. The S3 link to this file is stored on the NFT on the blockchain.   When you choose LINK, the nft_url you provide is stored on the blockchain, and the nft_metadata and nft_description are ignored and not stored anywhere. S3 is then NOT used. 
   * @return nftUploadMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When you choose S3, all of the nft_description, nft_name, nft_symbol, nft_metadata, and nft_url are put into a json dictionary and uploaded to S3 as a text file.  This is uploaded to an AWS S3 bucket we own, and is an option we provide at no charge. The S3 link to this file is stored on the NFT on the blockchain.   When you choose LINK, the nft_url you provide is stored on the blockchain, and the nft_metadata and nft_description are ignored and not stored anywhere. S3 is then NOT used. ")

  public NftUploadMethodEnum getNftUploadMethod() {
    return nftUploadMethod;
  }


  public void setNftUploadMethod(NftUploadMethodEnum nftUploadMethod) {
    this.nftUploadMethod = nftUploadMethod;
  }


  public NFTMintRequest isMutable(Boolean isMutable) {
    
    this.isMutable = isMutable;
    return this;
  }

   /**
   * Indicates whether or not the NFT created is mutable. If mutable, the NFT can be updated later. Once set to immutable, the NFT is unable to be changed. 
   * @return isMutable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether or not the NFT created is mutable. If mutable, the NFT can be updated later. Once set to immutable, the NFT is unable to be changed. ")

  public Boolean getIsMutable() {
    return isMutable;
  }


  public void setIsMutable(Boolean isMutable) {
    this.isMutable = isMutable;
  }


  public NFTMintRequest isMasterEdition(Boolean isMasterEdition) {
    
    this.isMasterEdition = isMasterEdition;
    return this;
  }

   /**
   * Whether or not the NFT is a master edition NFT. Saves about 0.001 SOL in transaction costs when set to false. 
   * @return isMasterEdition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the NFT is a master edition NFT. Saves about 0.001 SOL in transaction costs when set to false. ")

  public Boolean getIsMasterEdition() {
    return isMasterEdition;
  }


  public void setIsMasterEdition(Boolean isMasterEdition) {
    this.isMasterEdition = isMasterEdition;
  }


  public NFTMintRequest sellerFeeBasisPoints(BigDecimal sellerFeeBasisPoints) {
    
    this.sellerFeeBasisPoints = sellerFeeBasisPoints;
    return this;
  }

   /**
   * Valid values from 0 to 10000. Must be an integer.  Represents the number of basis points that the seller receives as a fee upon sale.  E.g., 100 indicates a 1% seller fee. Seller does not receive a fee when \&quot;primary_sale_has_happened\&quot; is set to true.  Will be set to false after first sale has occurred. 
   * @return sellerFeeBasisPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Valid values from 0 to 10000. Must be an integer.  Represents the number of basis points that the seller receives as a fee upon sale.  E.g., 100 indicates a 1% seller fee. Seller does not receive a fee when \"primary_sale_has_happened\" is set to true.  Will be set to false after first sale has occurred. ")

  public BigDecimal getSellerFeeBasisPoints() {
    return sellerFeeBasisPoints;
  }


  public void setSellerFeeBasisPoints(BigDecimal sellerFeeBasisPoints) {
    this.sellerFeeBasisPoints = sellerFeeBasisPoints;
  }


  public NFTMintRequest creators(List<String> creators) {
    
    this.creators = creators;
    return this;
  }

  public NFTMintRequest addCreatorsItem(String creatorsItem) {
    if (this.creators == null) {
      this.creators = new ArrayList<String>();
    }
    this.creators.add(creatorsItem);
    return this;
  }

   /**
   * A JSON encoded string representing an array / list.  The designated creators of the NFT. Length of the creator list must match length of the list of share.  Valid lengths of the list range from 1 to 5. Each item in the list must be a valid public key address.    Only the public key corresponding to the seed phrase provided will be marked as verified. Any other creators supplied will be marked as unverified. 
   * @return creators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON encoded string representing an array / list.  The designated creators of the NFT. Length of the creator list must match length of the list of share.  Valid lengths of the list range from 1 to 5. Each item in the list must be a valid public key address.    Only the public key corresponding to the seed phrase provided will be marked as verified. Any other creators supplied will be marked as unverified. ")

  public List<String> getCreators() {
    return creators;
  }


  public void setCreators(List<String> creators) {
    this.creators = creators;
  }


  public NFTMintRequest share(List<Integer> share) {
    
    this.share = share;
    return this;
  }

  public NFTMintRequest addShareItem(Integer shareItem) {
    if (this.share == null) {
      this.share = new ArrayList<Integer>();
    }
    this.share.add(shareItem);
    return this;
  }

   /**
   * A JSON encoded string representing an array / list.  The share of the royalty that each creator gets. Valid values range from 0 to 100.  Sum of the values must equal 100.  Only integer value accepted. Length of the share list must match length of the list of creators. 
   * @return share
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON encoded string representing an array / list.  The share of the royalty that each creator gets. Valid values range from 0 to 100.  Sum of the values must equal 100.  Only integer value accepted. Length of the share list must match length of the list of creators. ")

  public List<Integer> getShare() {
    return share;
  }


  public void setShare(List<Integer> share) {
    this.share = share;
  }


  public NFTMintRequest mintToPublicKey(String mintToPublicKey) {
    
    this.mintToPublicKey = mintToPublicKey;
    return this;
  }

   /**
   * Assign ownership of the NFT to the public key address given by &#x60;mint_to_public_key&#x60; 
   * @return mintToPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Assign ownership of the NFT to the public key address given by `mint_to_public_key` ")

  public String getMintToPublicKey() {
    return mintToPublicKey;
  }


  public void setMintToPublicKey(String mintToPublicKey) {
    this.mintToPublicKey = mintToPublicKey;
  }


  public NFTMintRequest network(NetworkEnum network) {
    
    this.network = network;
    return this;
  }

   /**
   * This determines which network you choose to run the API calls on. We recommend first testing on the devnet, because minting an NFT costs a little above 0.01 SOL, which is about $1.60 at the time of this writing.  When you run on the mainnet-beta, each successful call will deduct approximately that much. When you run on the devnet, that amount is deducted from a simulated amount, so you are not paying with real SOL. To get SOL on the devnet,   airdrop SOL to this address using the CLI. Keep in mind that you can only do this every so often. If you are rate-limited, consider using a VPN and trying again, or just waiting. To get SOL on the mainnet-beta, you    must transfer real SOL to this account from another wallet (e.g., from another wallet you own, from an exchange, etc.). We hope to make this process easier in the future, and if you have any suggestions, please add them    as an issue on our &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/the-blockchain-api\&quot; target&#x3D;\&quot;_blank\&quot;&gt;GitHub repository&lt;/a&gt; for the API. To get a fee estimate, make a GET requests to the &lt;a href&#x3D;\&quot;#tag/Solana-NFT/paths/~1solana~1nft~1mint~1fee/get\&quot;&gt;v1/solana/nft/mint/fee endpoint&lt;/a&gt; (details in sidebar). 
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This determines which network you choose to run the API calls on. We recommend first testing on the devnet, because minting an NFT costs a little above 0.01 SOL, which is about $1.60 at the time of this writing.  When you run on the mainnet-beta, each successful call will deduct approximately that much. When you run on the devnet, that amount is deducted from a simulated amount, so you are not paying with real SOL. To get SOL on the devnet,   airdrop SOL to this address using the CLI. Keep in mind that you can only do this every so often. If you are rate-limited, consider using a VPN and trying again, or just waiting. To get SOL on the mainnet-beta, you    must transfer real SOL to this account from another wallet (e.g., from another wallet you own, from an exchange, etc.). We hope to make this process easier in the future, and if you have any suggestions, please add them    as an issue on our <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">GitHub repository</a> for the API. To get a fee estimate, make a GET requests to the <a href=\"#tag/Solana-NFT/paths/~1solana~1nft~1mint~1fee/get\">v1/solana/nft/mint/fee endpoint</a> (details in sidebar). ")

  public NetworkEnum getNetwork() {
    return network;
  }


  public void setNetwork(NetworkEnum network) {
    this.network = network;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFTMintRequest nfTMintRequest = (NFTMintRequest) o;
    return Objects.equals(this.wallet, nfTMintRequest.wallet) &&
        Objects.equals(this.nftName, nfTMintRequest.nftName) &&
        Objects.equals(this.nftSymbol, nfTMintRequest.nftSymbol) &&
        Objects.equals(this.nftDescription, nfTMintRequest.nftDescription) &&
        Objects.equals(this.nftUrl, nfTMintRequest.nftUrl) &&
        Objects.equals(this.nftMetadata, nfTMintRequest.nftMetadata) &&
        Objects.equals(this.nftUploadMethod, nfTMintRequest.nftUploadMethod) &&
        Objects.equals(this.isMutable, nfTMintRequest.isMutable) &&
        Objects.equals(this.isMasterEdition, nfTMintRequest.isMasterEdition) &&
        Objects.equals(this.sellerFeeBasisPoints, nfTMintRequest.sellerFeeBasisPoints) &&
        Objects.equals(this.creators, nfTMintRequest.creators) &&
        Objects.equals(this.share, nfTMintRequest.share) &&
        Objects.equals(this.mintToPublicKey, nfTMintRequest.mintToPublicKey) &&
        Objects.equals(this.network, nfTMintRequest.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallet, nftName, nftSymbol, nftDescription, nftUrl, nftMetadata, nftUploadMethod, isMutable, isMasterEdition, sellerFeeBasisPoints, creators, share, mintToPublicKey, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTMintRequest {\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    nftName: ").append(toIndentedString(nftName)).append("\n");
    sb.append("    nftSymbol: ").append(toIndentedString(nftSymbol)).append("\n");
    sb.append("    nftDescription: ").append(toIndentedString(nftDescription)).append("\n");
    sb.append("    nftUrl: ").append(toIndentedString(nftUrl)).append("\n");
    sb.append("    nftMetadata: ").append(toIndentedString(nftMetadata)).append("\n");
    sb.append("    nftUploadMethod: ").append(toIndentedString(nftUploadMethod)).append("\n");
    sb.append("    isMutable: ").append(toIndentedString(isMutable)).append("\n");
    sb.append("    isMasterEdition: ").append(toIndentedString(isMasterEdition)).append("\n");
    sb.append("    sellerFeeBasisPoints: ").append(toIndentedString(sellerFeeBasisPoints)).append("\n");
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    mintToPublicKey: ").append(toIndentedString(mintToPublicKey)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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

