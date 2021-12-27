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

/**
 * NFTSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T08:10:20.407381-08:00[America/Los_Angeles]")
public class NFTSearchRequest {
  public static final String SERIALIZED_NAME_UPDATE_AUTHORITY = "update_authority";
  @SerializedName(SERIALIZED_NAME_UPDATE_AUTHORITY)
  private String updateAuthority;

  /**
   * Only &#x60;exact_match&#x60; supported at this time
   */
  @JsonAdapter(UpdateAuthoritySearchMethodEnum.Adapter.class)
  public enum UpdateAuthoritySearchMethodEnum {
    EXACT_MATCH("exact_match");

    private String value;

    UpdateAuthoritySearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateAuthoritySearchMethodEnum fromValue(String value) {
      for (UpdateAuthoritySearchMethodEnum b : UpdateAuthoritySearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdateAuthoritySearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateAuthoritySearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateAuthoritySearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdateAuthoritySearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATE_AUTHORITY_SEARCH_METHOD = "update_authority_search_method";
  @SerializedName(SERIALIZED_NAME_UPDATE_AUTHORITY_SEARCH_METHOD)
  private UpdateAuthoritySearchMethodEnum updateAuthoritySearchMethod = UpdateAuthoritySearchMethodEnum.EXACT_MATCH;

  public static final String SERIALIZED_NAME_MINT_ADDRESS = "mint_address";
  @SerializedName(SERIALIZED_NAME_MINT_ADDRESS)
  private String mintAddress;

  /**
   * Only &#x60;exact_match&#x60; supported at this time
   */
  @JsonAdapter(MintAddressSearchMethodEnum.Adapter.class)
  public enum MintAddressSearchMethodEnum {
    EXACT_MATCH("exact_match");

    private String value;

    MintAddressSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MintAddressSearchMethodEnum fromValue(String value) {
      for (MintAddressSearchMethodEnum b : MintAddressSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MintAddressSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MintAddressSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MintAddressSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MintAddressSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MINT_ADDRESS_SEARCH_METHOD = "mint_address_search_method";
  @SerializedName(SERIALIZED_NAME_MINT_ADDRESS_SEARCH_METHOD)
  private MintAddressSearchMethodEnum mintAddressSearchMethod = MintAddressSearchMethodEnum.EXACT_MATCH;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Gets or Sets nameSearchMethod
   */
  @JsonAdapter(NameSearchMethodEnum.Adapter.class)
  public enum NameSearchMethodEnum {
    BEGINS_WITH("begins_with"),
    
    EXACT_MATCH("exact_match");

    private String value;

    NameSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameSearchMethodEnum fromValue(String value) {
      for (NameSearchMethodEnum b : NameSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME_SEARCH_METHOD = "name_search_method";
  @SerializedName(SERIALIZED_NAME_NAME_SEARCH_METHOD)
  private NameSearchMethodEnum nameSearchMethod = NameSearchMethodEnum.EXACT_MATCH;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  /**
   * Gets or Sets uriSearchMethod
   */
  @JsonAdapter(UriSearchMethodEnum.Adapter.class)
  public enum UriSearchMethodEnum {
    BEGINS_WITH("begins_with"),
    
    EXACT_MATCH("exact_match");

    private String value;

    UriSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UriSearchMethodEnum fromValue(String value) {
      for (UriSearchMethodEnum b : UriSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UriSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UriSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UriSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UriSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_URI_SEARCH_METHOD = "uri_search_method";
  @SerializedName(SERIALIZED_NAME_URI_SEARCH_METHOD)
  private UriSearchMethodEnum uriSearchMethod = UriSearchMethodEnum.EXACT_MATCH;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  /**
   * Gets or Sets symbolSearchMethod
   */
  @JsonAdapter(SymbolSearchMethodEnum.Adapter.class)
  public enum SymbolSearchMethodEnum {
    BEGINS_WITH("begins_with"),
    
    EXACT_MATCH("exact_match");

    private String value;

    SymbolSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SymbolSearchMethodEnum fromValue(String value) {
      for (SymbolSearchMethodEnum b : SymbolSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SymbolSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SymbolSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SymbolSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SymbolSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SYMBOL_SEARCH_METHOD = "symbol_search_method";
  @SerializedName(SERIALIZED_NAME_SYMBOL_SEARCH_METHOD)
  private SymbolSearchMethodEnum symbolSearchMethod = SymbolSearchMethodEnum.EXACT_MATCH;

  /**
   * Gets or Sets network
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


  public NFTSearchRequest updateAuthority(String updateAuthority) {
    
    this.updateAuthority = updateAuthority;
    return this;
  }

   /**
   * The public key of the update authority of the NFT
   * @return updateAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key of the update authority of the NFT")

  public String getUpdateAuthority() {
    return updateAuthority;
  }


  public void setUpdateAuthority(String updateAuthority) {
    this.updateAuthority = updateAuthority;
  }


  public NFTSearchRequest updateAuthoritySearchMethod(UpdateAuthoritySearchMethodEnum updateAuthoritySearchMethod) {
    
    this.updateAuthoritySearchMethod = updateAuthoritySearchMethod;
    return this;
  }

   /**
   * Only &#x60;exact_match&#x60; supported at this time
   * @return updateAuthoritySearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only `exact_match` supported at this time")

  public UpdateAuthoritySearchMethodEnum getUpdateAuthoritySearchMethod() {
    return updateAuthoritySearchMethod;
  }


  public void setUpdateAuthoritySearchMethod(UpdateAuthoritySearchMethodEnum updateAuthoritySearchMethod) {
    this.updateAuthoritySearchMethod = updateAuthoritySearchMethod;
  }


  public NFTSearchRequest mintAddress(String mintAddress) {
    
    this.mintAddress = mintAddress;
    return this;
  }

   /**
   * The mint address of the NFT
   * @return mintAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mint address of the NFT")

  public String getMintAddress() {
    return mintAddress;
  }


  public void setMintAddress(String mintAddress) {
    this.mintAddress = mintAddress;
  }


  public NFTSearchRequest mintAddressSearchMethod(MintAddressSearchMethodEnum mintAddressSearchMethod) {
    
    this.mintAddressSearchMethod = mintAddressSearchMethod;
    return this;
  }

   /**
   * Only &#x60;exact_match&#x60; supported at this time
   * @return mintAddressSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only `exact_match` supported at this time")

  public MintAddressSearchMethodEnum getMintAddressSearchMethod() {
    return mintAddressSearchMethod;
  }


  public void setMintAddressSearchMethod(MintAddressSearchMethodEnum mintAddressSearchMethod) {
    this.mintAddressSearchMethod = mintAddressSearchMethod;
  }


  public NFTSearchRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the NFT
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the NFT")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NFTSearchRequest nameSearchMethod(NameSearchMethodEnum nameSearchMethod) {
    
    this.nameSearchMethod = nameSearchMethod;
    return this;
  }

   /**
   * Get nameSearchMethod
   * @return nameSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameSearchMethodEnum getNameSearchMethod() {
    return nameSearchMethod;
  }


  public void setNameSearchMethod(NameSearchMethodEnum nameSearchMethod) {
    this.nameSearchMethod = nameSearchMethod;
  }


  public NFTSearchRequest uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The NFT&#39;s uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The NFT's uri")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public NFTSearchRequest uriSearchMethod(UriSearchMethodEnum uriSearchMethod) {
    
    this.uriSearchMethod = uriSearchMethod;
    return this;
  }

   /**
   * Get uriSearchMethod
   * @return uriSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UriSearchMethodEnum getUriSearchMethod() {
    return uriSearchMethod;
  }


  public void setUriSearchMethod(UriSearchMethodEnum uriSearchMethod) {
    this.uriSearchMethod = uriSearchMethod;
  }


  public NFTSearchRequest symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol associated with the candy machine
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol associated with the candy machine")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public NFTSearchRequest symbolSearchMethod(SymbolSearchMethodEnum symbolSearchMethod) {
    
    this.symbolSearchMethod = symbolSearchMethod;
    return this;
  }

   /**
   * Get symbolSearchMethod
   * @return symbolSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SymbolSearchMethodEnum getSymbolSearchMethod() {
    return symbolSearchMethod;
  }


  public void setSymbolSearchMethod(SymbolSearchMethodEnum symbolSearchMethod) {
    this.symbolSearchMethod = symbolSearchMethod;
  }


  public NFTSearchRequest network(NetworkEnum network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    NFTSearchRequest nfTSearchRequest = (NFTSearchRequest) o;
    return Objects.equals(this.updateAuthority, nfTSearchRequest.updateAuthority) &&
        Objects.equals(this.updateAuthoritySearchMethod, nfTSearchRequest.updateAuthoritySearchMethod) &&
        Objects.equals(this.mintAddress, nfTSearchRequest.mintAddress) &&
        Objects.equals(this.mintAddressSearchMethod, nfTSearchRequest.mintAddressSearchMethod) &&
        Objects.equals(this.name, nfTSearchRequest.name) &&
        Objects.equals(this.nameSearchMethod, nfTSearchRequest.nameSearchMethod) &&
        Objects.equals(this.uri, nfTSearchRequest.uri) &&
        Objects.equals(this.uriSearchMethod, nfTSearchRequest.uriSearchMethod) &&
        Objects.equals(this.symbol, nfTSearchRequest.symbol) &&
        Objects.equals(this.symbolSearchMethod, nfTSearchRequest.symbolSearchMethod) &&
        Objects.equals(this.network, nfTSearchRequest.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateAuthority, updateAuthoritySearchMethod, mintAddress, mintAddressSearchMethod, name, nameSearchMethod, uri, uriSearchMethod, symbol, symbolSearchMethod, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTSearchRequest {\n");
    sb.append("    updateAuthority: ").append(toIndentedString(updateAuthority)).append("\n");
    sb.append("    updateAuthoritySearchMethod: ").append(toIndentedString(updateAuthoritySearchMethod)).append("\n");
    sb.append("    mintAddress: ").append(toIndentedString(mintAddress)).append("\n");
    sb.append("    mintAddressSearchMethod: ").append(toIndentedString(mintAddressSearchMethod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameSearchMethod: ").append(toIndentedString(nameSearchMethod)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriSearchMethod: ").append(toIndentedString(uriSearchMethod)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolSearchMethod: ").append(toIndentedString(symbolSearchMethod)).append("\n");
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

