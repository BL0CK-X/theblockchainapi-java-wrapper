/*
 * The Blockchain API
 * # About  Our vision is to make it super easy to interact with the decentralized web. We want you to be able to do this in any coding language and do it easily and quickly.   You're a key part of our vision. We love feature requests! <a href=\"#section/Feature-Requests\">Make one!</a>  # How to Use the API  To use the API, you simply need to create an API key pair.  Doing so takes less than a minute. Simply go to <a target=\"_blank\" href=\"https://dashboard.blockchainapi.com\">the dashboard</a>, create an account, and generate a key pair. You can now use this pair to make API requests. You must create your first pair via the dashboard.  # Feature Requests  Got a feature request? Submit it as an issue on <a target=\"_blank\" href=\"https://github.com/BL0CK-X/the-blockchain-api/issues/new/choose\">our GitHub repo</a> or [email us](mailto:info@blockchainapi.com).  # Contact  <figure>     <img          width=\"40px\"         height=\"40px\"          src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/phone.svg\"     />     <figcaption style=\"textAlign:center;\">Text / Call: +1 (415) 888 4745 </figcaption> </figure> <a href=\"mailto:info@blockchainapi.com\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/email.svg\"         />         <figcaption style=\"textAlign:center;\">Email us: info@blockchainapi.com</figcaption>     </figure> </a> <a href=\"https://discord.gg/d49yzrZRAF\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/discord.svg\"         />         <figcaption style=\"textAlign:center;\">Join our Discord</figcaption>     </figure> </a> <a href=\"https://twitter.com/_BlockX_\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/twitter.svg\"         />          <figcaption style=\"textAlign:center;\">Follow us on Twitter</figcaption>     </figure> </a> <a href=\"https://github.com/BL0CK-X/the-blockchain-api\" target=\"_blank\">     <figure>         <img              width=\"40px\"             height=\"40px\"              src=\"https://theblockchainapi-docs.s3.amazonaws.com/icons/github.svg\"         />         <figcaption style=\"textAlign:center;\">Star us on Github</figcaption>     </figure> </a>  # Security  Common dogma is to never give out your seed phrase. We agree. It's a matter of security, and anyone who has your seed phrase can irreversibly empty your wallet.   <b>When using an API endpoint that requires a seed phrase, we highly recommend that users use or create a wallet that they do not use as their primary wallet.</b>   How you make this work depends on what you're doing. If you're minting an NFT for example, we recommend creating a new wallet and then transferring just enough SOL to that wallet to mint the NFT. This is possible on Solana because such transactions cost less than a penny. We will have more tutorials in the future that make it easier for you to be secure when using our API.  We have easy-to-use endpoints for <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1secret_recovery_phrase/post\">creating a new seed phrase</a> and then <a href=\"#tag/Solana-Wallet/paths/~1solana~1wallet~1public_key/post\">deriving a public key</a> to enable you to transfer to that new wallet.  Let's have a constructive dialog about this. Feel free to <a href=\"#section/Contact\">contact us</a>. I made a video discussing this matter <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.  Note: We have had a couple of individuals harrass and threaten us. These individuals did <b>not</b> try our API or speak to anyone who has used it. They simply saw that we require a seed phrase for certain endpoints and figured that the proper response was to attack us. (I explain why we do <a target=\"_blank\" href=\"https://youtu.be/m9unUb8Z9qU\">here</a>.) Such harrassment and threats are not only harmful, but they are also illegal, and we will report offenders. Do not harrass us. Rather, feel free to discuss your concerns with us and we will be more than happy to work with you to come up with a solution.  # Pricing  <b>Each user receives 500 free credits.</b>  You can learn more about our pricing <a href=\"https://dashboard.blockchainapi.com/billing\" target=\"_blank\">here</a>.   We frequently do custom plans. If our pricing doesn't work for you, <a href=\"#section/Contact\">contact us</a>.  If you have questions, concerns, feedback, or ideas, <a href=\"#section/Contact\">contact us</a>.  # SDKs / API Wrappers  We have examples using both our <a href=\"https://github.com/BL0CK-X/the-blockchain-api/tree/main/examples\" target=\"_blank\">Python wrapper and our JavaScript wrapper here</a>.  We have built a custom <a href=\"https://github.com/BL0CK-X/the-blockchain-api-python-wrapper\" target=\"_blank\">Python wrapper</a>.  `pip install theblockchainapi`  We also have published a <a href=\"https://github.com/BL0CK-X/theblockchainapi-javascript-wrapper\" target=\"_blank\">JavaScript Wrapper</a>.  `npm install theblockchainapi`  We also have auto-generated wrappers for the following languages: - <a href=\"https://github.com/BL0CK-X/theblockchainapi-go-wrapper\" target = \"_blank\">Go</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-java-wrapper\" target = \"_blank\">Java</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-kotlin-wrapper\" target = \"_blank\">Kotlin</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-php-wrapper\" target = \"_blank\">PHP</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-swift-wrapper\" target = \"_blank\">Swift5</a> - <a href=\"https://github.com/BL0CK-X/theblockchainapi-typescript-wrapper\" target = \"_blank\">TypeScript</a>  If you would like a different language as well, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.  If you run into any bugs with the wrappers, submit an issue <a href=\"https://github.com/BL0CK-X/theblockchainapi-wrappers/issues/new\" target=\"_blank\">here</a>.
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

/**
 * CandyMachineSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-18T21:45:13.207180-08:00[America/Los_Angeles]")
public class CandyMachineSearchRequest {
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

  public static final String SERIALIZED_NAME_CONFIG_ADDRESS = "config_address";
  @SerializedName(SERIALIZED_NAME_CONFIG_ADDRESS)
  private String configAddress;

  /**
   * Only &#x60;exact_match&#x60; supported at this time
   */
  @JsonAdapter(ConfigAddressSearchMethodEnum.Adapter.class)
  public enum ConfigAddressSearchMethodEnum {
    EXACT_MATCH("exact_match");

    private String value;

    ConfigAddressSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigAddressSearchMethodEnum fromValue(String value) {
      for (ConfigAddressSearchMethodEnum b : ConfigAddressSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfigAddressSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigAddressSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigAddressSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConfigAddressSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONFIG_ADDRESS_SEARCH_METHOD = "config_address_search_method";
  @SerializedName(SERIALIZED_NAME_CONFIG_ADDRESS_SEARCH_METHOD)
  private ConfigAddressSearchMethodEnum configAddressSearchMethod = ConfigAddressSearchMethodEnum.EXACT_MATCH;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  /**
   * Only &#x60;exact_match&#x60; supported at this time
   */
  @JsonAdapter(UuidSearchMethodEnum.Adapter.class)
  public enum UuidSearchMethodEnum {
    EXACT_MATCH("exact_match");

    private String value;

    UuidSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UuidSearchMethodEnum fromValue(String value) {
      for (UuidSearchMethodEnum b : UuidSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UuidSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UuidSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UuidSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UuidSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UUID_SEARCH_METHOD = "uuid_search_method";
  @SerializedName(SERIALIZED_NAME_UUID_SEARCH_METHOD)
  private UuidSearchMethodEnum uuidSearchMethod = UuidSearchMethodEnum.EXACT_MATCH;

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

  public static final String SERIALIZED_NAME_NFT_NAME = "nft_name";
  @SerializedName(SERIALIZED_NAME_NFT_NAME)
  private String nftName;

  public static final String SERIALIZED_NAME_NFT_NAME_INDEX = "nft_name_index";
  @SerializedName(SERIALIZED_NAME_NFT_NAME_INDEX)
  private String nftNameIndex = "0";

  /**
   * Gets or Sets nftNameSearchMethod
   */
  @JsonAdapter(NftNameSearchMethodEnum.Adapter.class)
  public enum NftNameSearchMethodEnum {
    BEGINS_WITH("begins_with"),
    
    EXACT_MATCH("exact_match");

    private String value;

    NftNameSearchMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NftNameSearchMethodEnum fromValue(String value) {
      for (NftNameSearchMethodEnum b : NftNameSearchMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NftNameSearchMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NftNameSearchMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NftNameSearchMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NftNameSearchMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NFT_NAME_SEARCH_METHOD = "nft_name_search_method";
  @SerializedName(SERIALIZED_NAME_NFT_NAME_SEARCH_METHOD)
  private NftNameSearchMethodEnum nftNameSearchMethod = NftNameSearchMethodEnum.EXACT_MATCH;

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

  /**
   * The candy machine contract you want to search.  If you want to search &#x60;v1&#x60; candy machines, set this to &#x60;v1&#x60;. If you want to search &#x60;v2&#x60; candy machines. set this to &#x60;v2&#x60;. 
   */
  @JsonAdapter(CandyMachineContractVersionEnum.Adapter.class)
  public enum CandyMachineContractVersionEnum {
    V1("v1"),
    
    V2("v2");

    private String value;

    CandyMachineContractVersionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CandyMachineContractVersionEnum fromValue(String value) {
      for (CandyMachineContractVersionEnum b : CandyMachineContractVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CandyMachineContractVersionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CandyMachineContractVersionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CandyMachineContractVersionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CandyMachineContractVersionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CANDY_MACHINE_CONTRACT_VERSION = "candy_machine_contract_version";
  @SerializedName(SERIALIZED_NAME_CANDY_MACHINE_CONTRACT_VERSION)
  private CandyMachineContractVersionEnum candyMachineContractVersion = CandyMachineContractVersionEnum.V1;


  public CandyMachineSearchRequest updateAuthority(String updateAuthority) {
    
    this.updateAuthority = updateAuthority;
    return this;
  }

   /**
   * The public key of the update authority of the candy machine
   * @return updateAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key of the update authority of the candy machine")

  public String getUpdateAuthority() {
    return updateAuthority;
  }


  public void setUpdateAuthority(String updateAuthority) {
    this.updateAuthority = updateAuthority;
  }


  public CandyMachineSearchRequest updateAuthoritySearchMethod(UpdateAuthoritySearchMethodEnum updateAuthoritySearchMethod) {
    
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


  public CandyMachineSearchRequest configAddress(String configAddress) {
    
    this.configAddress = configAddress;
    return this;
  }

   /**
   * The public key of the configuration of the candy machine
   * @return configAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key of the configuration of the candy machine")

  public String getConfigAddress() {
    return configAddress;
  }


  public void setConfigAddress(String configAddress) {
    this.configAddress = configAddress;
  }


  public CandyMachineSearchRequest configAddressSearchMethod(ConfigAddressSearchMethodEnum configAddressSearchMethod) {
    
    this.configAddressSearchMethod = configAddressSearchMethod;
    return this;
  }

   /**
   * Only &#x60;exact_match&#x60; supported at this time
   * @return configAddressSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only `exact_match` supported at this time")

  public ConfigAddressSearchMethodEnum getConfigAddressSearchMethod() {
    return configAddressSearchMethod;
  }


  public void setConfigAddressSearchMethod(ConfigAddressSearchMethodEnum configAddressSearchMethod) {
    this.configAddressSearchMethod = configAddressSearchMethod;
  }


  public CandyMachineSearchRequest uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * The alphanumeric string of length six that corresponds to the candy machine. This is NOT the candy machine ID.  This is the first six letters of the configuration address and is also used to identify the candy machine. An example is &#x60;4zKV6i&#x60;. 
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The alphanumeric string of length six that corresponds to the candy machine. This is NOT the candy machine ID.  This is the first six letters of the configuration address and is also used to identify the candy machine. An example is `4zKV6i`. ")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public CandyMachineSearchRequest uuidSearchMethod(UuidSearchMethodEnum uuidSearchMethod) {
    
    this.uuidSearchMethod = uuidSearchMethod;
    return this;
  }

   /**
   * Only &#x60;exact_match&#x60; supported at this time
   * @return uuidSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only `exact_match` supported at this time")

  public UuidSearchMethodEnum getUuidSearchMethod() {
    return uuidSearchMethod;
  }


  public void setUuidSearchMethod(UuidSearchMethodEnum uuidSearchMethod) {
    this.uuidSearchMethod = uuidSearchMethod;
  }


  public CandyMachineSearchRequest symbol(String symbol) {
    
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


  public CandyMachineSearchRequest symbolSearchMethod(SymbolSearchMethodEnum symbolSearchMethod) {
    
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


  public CandyMachineSearchRequest nftName(String nftName) {
    
    this.nftName = nftName;
    return this;
  }

   /**
   * The name of an NFT on the candy machine, minted or unminted. For example, to find The Solana Money Boys candy machine, you already know that each NFT is named \&quot;Solana Money Boy #0\&quot;, \&quot;Solana Money Boy #1\&quot;, and so on. So you could search with  nft_name&#x3D;\&quot;Solana Money Boy #0\&quot;, nft_name_index&#x3D;0, nft_name_search_method&#x3D;&#39;exact_match&#39;, for example, which would return the candy machine ID. This also works with candy machines that are not live but are uploaded. 
   * @return nftName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of an NFT on the candy machine, minted or unminted. For example, to find The Solana Money Boys candy machine, you already know that each NFT is named \"Solana Money Boy #0\", \"Solana Money Boy #1\", and so on. So you could search with  nft_name=\"Solana Money Boy #0\", nft_name_index=0, nft_name_search_method='exact_match', for example, which would return the candy machine ID. This also works with candy machines that are not live but are uploaded. ")

  public String getNftName() {
    return nftName;
  }


  public void setNftName(String nftName) {
    this.nftName = nftName;
  }


  public CandyMachineSearchRequest nftNameIndex(String nftNameIndex) {
    
    this.nftNameIndex = nftNameIndex;
    return this;
  }

   /**
   * The index of the NFT to check, e.g., the 2nd NFT would have an index of 1. We cannot search all NFTs on a candy machine currently, so you must search an NFT at a particular position, such as the first, second, and so on. In general, nft_name_index&#x3D;0 works for most use cases. 
   * @return nftNameIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the NFT to check, e.g., the 2nd NFT would have an index of 1. We cannot search all NFTs on a candy machine currently, so you must search an NFT at a particular position, such as the first, second, and so on. In general, nft_name_index=0 works for most use cases. ")

  public String getNftNameIndex() {
    return nftNameIndex;
  }


  public void setNftNameIndex(String nftNameIndex) {
    this.nftNameIndex = nftNameIndex;
  }


  public CandyMachineSearchRequest nftNameSearchMethod(NftNameSearchMethodEnum nftNameSearchMethod) {
    
    this.nftNameSearchMethod = nftNameSearchMethod;
    return this;
  }

   /**
   * Get nftNameSearchMethod
   * @return nftNameSearchMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NftNameSearchMethodEnum getNftNameSearchMethod() {
    return nftNameSearchMethod;
  }


  public void setNftNameSearchMethod(NftNameSearchMethodEnum nftNameSearchMethod) {
    this.nftNameSearchMethod = nftNameSearchMethod;
  }


  public CandyMachineSearchRequest network(NetworkEnum network) {
    
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


  public CandyMachineSearchRequest candyMachineContractVersion(CandyMachineContractVersionEnum candyMachineContractVersion) {
    
    this.candyMachineContractVersion = candyMachineContractVersion;
    return this;
  }

   /**
   * The candy machine contract you want to search.  If you want to search &#x60;v1&#x60; candy machines, set this to &#x60;v1&#x60;. If you want to search &#x60;v2&#x60; candy machines. set this to &#x60;v2&#x60;. 
   * @return candyMachineContractVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The candy machine contract you want to search.  If you want to search `v1` candy machines, set this to `v1`. If you want to search `v2` candy machines. set this to `v2`. ")

  public CandyMachineContractVersionEnum getCandyMachineContractVersion() {
    return candyMachineContractVersion;
  }


  public void setCandyMachineContractVersion(CandyMachineContractVersionEnum candyMachineContractVersion) {
    this.candyMachineContractVersion = candyMachineContractVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandyMachineSearchRequest candyMachineSearchRequest = (CandyMachineSearchRequest) o;
    return Objects.equals(this.updateAuthority, candyMachineSearchRequest.updateAuthority) &&
        Objects.equals(this.updateAuthoritySearchMethod, candyMachineSearchRequest.updateAuthoritySearchMethod) &&
        Objects.equals(this.configAddress, candyMachineSearchRequest.configAddress) &&
        Objects.equals(this.configAddressSearchMethod, candyMachineSearchRequest.configAddressSearchMethod) &&
        Objects.equals(this.uuid, candyMachineSearchRequest.uuid) &&
        Objects.equals(this.uuidSearchMethod, candyMachineSearchRequest.uuidSearchMethod) &&
        Objects.equals(this.symbol, candyMachineSearchRequest.symbol) &&
        Objects.equals(this.symbolSearchMethod, candyMachineSearchRequest.symbolSearchMethod) &&
        Objects.equals(this.nftName, candyMachineSearchRequest.nftName) &&
        Objects.equals(this.nftNameIndex, candyMachineSearchRequest.nftNameIndex) &&
        Objects.equals(this.nftNameSearchMethod, candyMachineSearchRequest.nftNameSearchMethod) &&
        Objects.equals(this.network, candyMachineSearchRequest.network) &&
        Objects.equals(this.candyMachineContractVersion, candyMachineSearchRequest.candyMachineContractVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateAuthority, updateAuthoritySearchMethod, configAddress, configAddressSearchMethod, uuid, uuidSearchMethod, symbol, symbolSearchMethod, nftName, nftNameIndex, nftNameSearchMethod, network, candyMachineContractVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandyMachineSearchRequest {\n");
    sb.append("    updateAuthority: ").append(toIndentedString(updateAuthority)).append("\n");
    sb.append("    updateAuthoritySearchMethod: ").append(toIndentedString(updateAuthoritySearchMethod)).append("\n");
    sb.append("    configAddress: ").append(toIndentedString(configAddress)).append("\n");
    sb.append("    configAddressSearchMethod: ").append(toIndentedString(configAddressSearchMethod)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    uuidSearchMethod: ").append(toIndentedString(uuidSearchMethod)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolSearchMethod: ").append(toIndentedString(symbolSearchMethod)).append("\n");
    sb.append("    nftName: ").append(toIndentedString(nftName)).append("\n");
    sb.append("    nftNameIndex: ").append(toIndentedString(nftNameIndex)).append("\n");
    sb.append("    nftNameSearchMethod: ").append(toIndentedString(nftNameSearchMethod)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    candyMachineContractVersion: ").append(toIndentedString(candyMachineContractVersion)).append("\n");
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

