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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Wallet;

/**
 * NFTMintRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-15T09:33:08.779026-07:00[America/Los_Angeles]")
public class NFTMintRequest {
  public static final String SERIALIZED_NAME_WAIT_FOR_CONFIRMATION = "wait_for_confirmation";
  @SerializedName(SERIALIZED_NAME_WAIT_FOR_CONFIRMATION)
  private Boolean waitForConfirmation = true;

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private Wallet wallet;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = "";

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol = "";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = "";

  /**
   * When you choose &#x60;S3&#x60;, all of the &#x60;name&#x60;, &#x60;description&#x60;, &#x60;symbol&#x60;, &#x60;uri_metadata&#x60;, and &#x60;image_url&#x60; are put into a JSON dictionary and uploaded to S3 as a JSON file.  This is uploaded to an AWS S3 bucket we own, and is an option we provide at no charge. The S3 link to this file is stored in the NFT&#39;s account on the blockchain. Learn more  &lt;a href&#x3D;\&quot;https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  When you choose &#x60;URI&#x60;, the &#x60;uri&#x60; you provide is stored on the blockchain, and the &#x60;uri_metadata&#x60;, &#x60;description&#x60;, and &#x60;image_url&#x60; are ignored and not stored anywhere. &#x60;S3&#x60; is NOT involved in this case.   An example of a &#x60;uri&#x60; you would provide is an Arweave URL, like this: &#x60;https://arweave.net/_Y8tETU3FbAFZSM1wXNeWPweWwrW9K6oSF1SYi_bH9A&#x60;.
   */
  @JsonAdapter(UploadMethodEnum.Adapter.class)
  public enum UploadMethodEnum {
    S3("S3"),
    
    URI("URI");

    private String value;

    UploadMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UploadMethodEnum fromValue(String value) {
      for (UploadMethodEnum b : UploadMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UploadMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UploadMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UploadMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UploadMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPLOAD_METHOD = "upload_method";
  @SerializedName(SERIALIZED_NAME_UPLOAD_METHOD)
  private UploadMethodEnum uploadMethod = UploadMethodEnum.S3;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri = "";

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = "";

  public static final String SERIALIZED_NAME_URI_METADATA = "uri_metadata";
  @SerializedName(SERIALIZED_NAME_URI_METADATA)
  private Object uriMetadata = {};

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

  public NFTMintRequest() { 
  }

  public NFTMintRequest waitForConfirmation(Boolean waitForConfirmation) {
    
    this.waitForConfirmation = waitForConfirmation;
    return this;
  }

   /**
   * Whether to wait for the NFT mint to be confirmed on the blockchain or simply be processed.  Processed means that our node has picked up the transaction request, but not that it was confirmed by the Solana cluster.   Confirmed means that the cluster voted on your transaction and approved it. To be completely sure that the NFT was minted, you can either set &#x60;wait_for_confirmation&#x3D;True&#x60; (call takes 20 seconds with True; about 4 seconds for processed) or you can [get the metadata](/#tag/Solana-NFT/operation/solanaGetNFT) from the mint returned. Once it returns the NFT metadata, then the NFT should have been successfully minted. 
   * @return waitForConfirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to wait for the NFT mint to be confirmed on the blockchain or simply be processed.  Processed means that our node has picked up the transaction request, but not that it was confirmed by the Solana cluster.   Confirmed means that the cluster voted on your transaction and approved it. To be completely sure that the NFT was minted, you can either set `wait_for_confirmation=True` (call takes 20 seconds with True; about 4 seconds for processed) or you can [get the metadata](/#tag/Solana-NFT/operation/solanaGetNFT) from the mint returned. Once it returns the NFT metadata, then the NFT should have been successfully minted. ")

  public Boolean getWaitForConfirmation() {
    return waitForConfirmation;
  }


  public void setWaitForConfirmation(Boolean waitForConfirmation) {
    this.waitForConfirmation = waitForConfirmation;
  }


  public NFTMintRequest wallet(Wallet wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Wallet getWallet() {
    return wallet;
  }


  public void setWallet(Wallet wallet) {
    this.wallet = wallet;
  }


  public NFTMintRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the token. Limited to 32 characters. Stored on the blockchain.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the token. Limited to 32 characters. Stored on the blockchain.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NFTMintRequest symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the token. Limited to 10 characters. Stored on the blockchain.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the token. Limited to 10 characters. Stored on the blockchain.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public NFTMintRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the NFT. Limited to 2000 characters. Not stored on the blockchain.         If you are providing your own &#x60;uri&#x60; (see above), then you do not need to provide this.  If you are not providing your own &#x60;uri&#x60; and you do not provide this, then there wills simply be no description.  Only provide a value for &#x60;description&#x60; if the &#x60;upload_method&#x60; is set to &#x60;S3&#x60; (see the description for &#x60;upload_method&#x60; above).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the NFT. Limited to 2000 characters. Not stored on the blockchain.         If you are providing your own `uri` (see above), then you do not need to provide this.  If you are not providing your own `uri` and you do not provide this, then there wills simply be no description.  Only provide a value for `description` if the `upload_method` is set to `S3` (see the description for `upload_method` above).")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NFTMintRequest uploadMethod(UploadMethodEnum uploadMethod) {
    
    this.uploadMethod = uploadMethod;
    return this;
  }

   /**
   * When you choose &#x60;S3&#x60;, all of the &#x60;name&#x60;, &#x60;description&#x60;, &#x60;symbol&#x60;, &#x60;uri_metadata&#x60;, and &#x60;image_url&#x60; are put into a JSON dictionary and uploaded to S3 as a JSON file.  This is uploaded to an AWS S3 bucket we own, and is an option we provide at no charge. The S3 link to this file is stored in the NFT&#39;s account on the blockchain. Learn more  &lt;a href&#x3D;\&quot;https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  When you choose &#x60;URI&#x60;, the &#x60;uri&#x60; you provide is stored on the blockchain, and the &#x60;uri_metadata&#x60;, &#x60;description&#x60;, and &#x60;image_url&#x60; are ignored and not stored anywhere. &#x60;S3&#x60; is NOT involved in this case.   An example of a &#x60;uri&#x60; you would provide is an Arweave URL, like this: &#x60;https://arweave.net/_Y8tETU3FbAFZSM1wXNeWPweWwrW9K6oSF1SYi_bH9A&#x60;.
   * @return uploadMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When you choose `S3`, all of the `name`, `description`, `symbol`, `uri_metadata`, and `image_url` are put into a JSON dictionary and uploaded to S3 as a JSON file.  This is uploaded to an AWS S3 bucket we own, and is an option we provide at no charge. The S3 link to this file is stored in the NFT's account on the blockchain. Learn more  <a href=\"https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\" target=\"_blank\">here</a>.  When you choose `URI`, the `uri` you provide is stored on the blockchain, and the `uri_metadata`, `description`, and `image_url` are ignored and not stored anywhere. `S3` is NOT involved in this case.   An example of a `uri` you would provide is an Arweave URL, like this: `https://arweave.net/_Y8tETU3FbAFZSM1wXNeWPweWwrW9K6oSF1SYi_bH9A`.")

  public UploadMethodEnum getUploadMethod() {
    return uploadMethod;
  }


  public void setUploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
  }


  public NFTMintRequest uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The &#x60;uri&#x60; you provide is stored on the blockchain, and the &#x60;uri_metadata&#x60;, &#x60;description&#x60;, and &#x60;image_url&#x60; are ignored and not stored anywhere. &#x60;S3&#x60; is NOT involved in this case.   Read more &lt;a href&#x3D;\&quot;https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.  An example of a &#x60;uri&#x60; you would provide is an Arweave URL, like this: &#x60;https://arweave.net/_Y8tETU3FbAFZSM1wXNeWPweWwrW9K6oSF1SYi_bH9A&#x60;.  Only provide a value for &#x60;uri&#x60; if the &#x60;upload_method&#x60; is set to &#x60;URI&#x60; (see the description for &#x60;upload_method&#x60; above).
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `uri` you provide is stored on the blockchain, and the `uri_metadata`, `description`, and `image_url` are ignored and not stored anywhere. `S3` is NOT involved in this case.   Read more <a href=\"https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\" target=\"_blank\">here</a>.  An example of a `uri` you would provide is an Arweave URL, like this: `https://arweave.net/_Y8tETU3FbAFZSM1wXNeWPweWwrW9K6oSF1SYi_bH9A`.  Only provide a value for `uri` if the `upload_method` is set to `URI` (see the description for `upload_method` above).")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public NFTMintRequest imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The URL of the image of the NFT.         If you are providing your own &#x60;uri&#x60; (see above), then you do not need to provide this.  If you are not providing your own &#x60;uri&#x60; and you do not provide this, then there wills simply be no image.  Only provide a value for &#x60;image_url&#x60; if the &#x60;upload_method&#x60; is set to &#x60;S3&#x60; (see the description for &#x60;upload_method&#x60; above).
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the image of the NFT.         If you are providing your own `uri` (see above), then you do not need to provide this.  If you are not providing your own `uri` and you do not provide this, then there wills simply be no image.  Only provide a value for `image_url` if the `upload_method` is set to `S3` (see the description for `upload_method` above).")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public NFTMintRequest uriMetadata(Object uriMetadata) {
    
    this.uriMetadata = uriMetadata;
    return this;
  }

   /**
   * The off-chain metadata.        If you are providing your own &#x60;uri&#x60; (see above), then you do not need to provide this.  If you are not providing your own &#x60;uri&#x60; and you do not provide this, then there wills simply be no image.  Only provide a value for &#x60;uri_metadata&#x60; if the &#x60;upload_method&#x60; is set to &#x60;S3&#x60; (see the description for &#x60;upload_method&#x60; above).  Learn more about how to format this metadata &lt;a href&#x3D;\&quot;https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;.
   * @return uriMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The off-chain metadata.        If you are providing your own `uri` (see above), then you do not need to provide this.  If you are not providing your own `uri` and you do not provide this, then there wills simply be no image.  Only provide a value for `uri_metadata` if the `upload_method` is set to `S3` (see the description for `upload_method` above).  Learn more about how to format this metadata <a href=\"https://blockchainapi.com/2022/01/18/how-to-format-off-chain-nft-metadata.html\" target=\"_blank\">here</a>.")

  public Object getUriMetadata() {
    return uriMetadata;
  }


  public void setUriMetadata(Object uriMetadata) {
    this.uriMetadata = uriMetadata;
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
   * A JSON encoded string representing an array / list.  The share of the royalty that each creator gets. Valid values range from 0 to 100. Sum of the values must equal 100.  Only integer value accepted. Length of the share list must match length of the list of creators. 
   * @return share
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON encoded string representing an array / list.  The share of the royalty that each creator gets. Valid values range from 0 to 100. Sum of the values must equal 100.  Only integer value accepted. Length of the share list must match length of the list of creators. ")

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
    return Objects.equals(this.waitForConfirmation, nfTMintRequest.waitForConfirmation) &&
        Objects.equals(this.wallet, nfTMintRequest.wallet) &&
        Objects.equals(this.name, nfTMintRequest.name) &&
        Objects.equals(this.symbol, nfTMintRequest.symbol) &&
        Objects.equals(this.description, nfTMintRequest.description) &&
        Objects.equals(this.uploadMethod, nfTMintRequest.uploadMethod) &&
        Objects.equals(this.uri, nfTMintRequest.uri) &&
        Objects.equals(this.imageUrl, nfTMintRequest.imageUrl) &&
        Objects.equals(this.uriMetadata, nfTMintRequest.uriMetadata) &&
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
    return Objects.hash(waitForConfirmation, wallet, name, symbol, description, uploadMethod, uri, imageUrl, uriMetadata, isMutable, isMasterEdition, sellerFeeBasisPoints, creators, share, mintToPublicKey, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTMintRequest {\n");
    sb.append("    waitForConfirmation: ").append(toIndentedString(waitForConfirmation)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uploadMethod: ").append(toIndentedString(uploadMethod)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    uriMetadata: ").append(toIndentedString(uriMetadata)).append("\n");
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

