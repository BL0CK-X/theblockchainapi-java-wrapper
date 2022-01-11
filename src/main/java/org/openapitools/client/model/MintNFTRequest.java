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
import org.openapitools.client.model.Wallet;

/**
 * MintNFTRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T17:38:57.777416-08:00[America/Los_Angeles]")
public class MintNFTRequest {
  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private Wallet wallet;

  public static final String SERIALIZED_NAME_CONFIG_ADDRESS = "config_address";
  @SerializedName(SERIALIZED_NAME_CONFIG_ADDRESS)
  private String configAddress;

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
   * The candy machine contract of the candy machine from which you&#39;re minting. If you are minting from a &#x60;v1&#x60; candy machine ID, set this to &#x60;v1&#x60;. If you are minting from a &#x60;v2&#x60; candy machine ID, set this to &#x60;v2&#x60;. If you don&#39;t know which the version of your candy machine, check out &lt;a href&#x3D;\&quot;#operation/solanaGetAccountIsCandyMachine\&quot;&gt;this endpoint&lt;/a&gt;. 
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


  public MintNFTRequest wallet(Wallet wallet) {
    
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


  public MintNFTRequest configAddress(String configAddress) {
    
    this.configAddress = configAddress;
    return this;
  }

   /**
   * The config address of the candy machine. You can retrieve this if you have the candy machine ID using &lt;a href&#x3D;\&quot;#operation/solanaGetCandyMachineDetails\&quot;&gt;this endpoint&lt;/a&gt; and retrieving the &#x60;config_address&#x60; from the response.  A candy machine ID is the same thing as a configuration address for v2 candy machines. 
   * @return configAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The config address of the candy machine. You can retrieve this if you have the candy machine ID using <a href=\"#operation/solanaGetCandyMachineDetails\">this endpoint</a> and retrieving the `config_address` from the response.  A candy machine ID is the same thing as a configuration address for v2 candy machines. ")

  public String getConfigAddress() {
    return configAddress;
  }


  public void setConfigAddress(String configAddress) {
    this.configAddress = configAddress;
  }


  public MintNFTRequest network(NetworkEnum network) {
    
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


  public MintNFTRequest candyMachineContractVersion(CandyMachineContractVersionEnum candyMachineContractVersion) {
    
    this.candyMachineContractVersion = candyMachineContractVersion;
    return this;
  }

   /**
   * The candy machine contract of the candy machine from which you&#39;re minting. If you are minting from a &#x60;v1&#x60; candy machine ID, set this to &#x60;v1&#x60;. If you are minting from a &#x60;v2&#x60; candy machine ID, set this to &#x60;v2&#x60;. If you don&#39;t know which the version of your candy machine, check out &lt;a href&#x3D;\&quot;#operation/solanaGetAccountIsCandyMachine\&quot;&gt;this endpoint&lt;/a&gt;. 
   * @return candyMachineContractVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The candy machine contract of the candy machine from which you're minting. If you are minting from a `v1` candy machine ID, set this to `v1`. If you are minting from a `v2` candy machine ID, set this to `v2`. If you don't know which the version of your candy machine, check out <a href=\"#operation/solanaGetAccountIsCandyMachine\">this endpoint</a>. ")

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
    MintNFTRequest mintNFTRequest = (MintNFTRequest) o;
    return Objects.equals(this.wallet, mintNFTRequest.wallet) &&
        Objects.equals(this.configAddress, mintNFTRequest.configAddress) &&
        Objects.equals(this.network, mintNFTRequest.network) &&
        Objects.equals(this.candyMachineContractVersion, mintNFTRequest.candyMachineContractVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallet, configAddress, network, candyMachineContractVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MintNFTRequest {\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    configAddress: ").append(toIndentedString(configAddress)).append("\n");
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

