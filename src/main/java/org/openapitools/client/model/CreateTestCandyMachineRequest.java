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
import org.openapitools.client.model.Wallet;

/**
 * CreateTestCandyMachineRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T11:04:39.768692-07:00[America/Los_Angeles]")
public class CreateTestCandyMachineRequest {
  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private Wallet wallet;

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
   * The contract you want to use to create the candy machine. Note: Metaplex disabled the creation of &#x60;v1&#x60; candy machines on their smart contract, and so we no longer support the creation of &#x60;v1&#x60; test candy machines. 
   */
  @JsonAdapter(CandyMachineContractVersionEnum.Adapter.class)
  public enum CandyMachineContractVersionEnum {
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
  private CandyMachineContractVersionEnum candyMachineContractVersion = CandyMachineContractVersionEnum.V2;

  public static final String SERIALIZED_NAME_INCLUDE_GATEKEEPER = "include_gatekeeper";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GATEKEEPER)
  private Boolean includeGatekeeper = false;

  public CreateTestCandyMachineRequest() { 
  }

  public CreateTestCandyMachineRequest wallet(Wallet wallet) {
    
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


  public CreateTestCandyMachineRequest network(NetworkEnum network) {
    
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


  public CreateTestCandyMachineRequest candyMachineContractVersion(CandyMachineContractVersionEnum candyMachineContractVersion) {
    
    this.candyMachineContractVersion = candyMachineContractVersion;
    return this;
  }

   /**
   * The contract you want to use to create the candy machine. Note: Metaplex disabled the creation of &#x60;v1&#x60; candy machines on their smart contract, and so we no longer support the creation of &#x60;v1&#x60; test candy machines. 
   * @return candyMachineContractVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The contract you want to use to create the candy machine. Note: Metaplex disabled the creation of `v1` candy machines on their smart contract, and so we no longer support the creation of `v1` test candy machines. ")

  public CandyMachineContractVersionEnum getCandyMachineContractVersion() {
    return candyMachineContractVersion;
  }


  public void setCandyMachineContractVersion(CandyMachineContractVersionEnum candyMachineContractVersion) {
    this.candyMachineContractVersion = candyMachineContractVersion;
  }


  public CreateTestCandyMachineRequest includeGatekeeper(Boolean includeGatekeeper) {
    
    this.includeGatekeeper = includeGatekeeper;
    return this;
  }

   /**
   * Whether or not to include a gatekeeper for testing purposes. Only applies to v2 candy machines.
   * @return includeGatekeeper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not to include a gatekeeper for testing purposes. Only applies to v2 candy machines.")

  public Boolean getIncludeGatekeeper() {
    return includeGatekeeper;
  }


  public void setIncludeGatekeeper(Boolean includeGatekeeper) {
    this.includeGatekeeper = includeGatekeeper;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTestCandyMachineRequest createTestCandyMachineRequest = (CreateTestCandyMachineRequest) o;
    return Objects.equals(this.wallet, createTestCandyMachineRequest.wallet) &&
        Objects.equals(this.network, createTestCandyMachineRequest.network) &&
        Objects.equals(this.candyMachineContractVersion, createTestCandyMachineRequest.candyMachineContractVersion) &&
        Objects.equals(this.includeGatekeeper, createTestCandyMachineRequest.includeGatekeeper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallet, network, candyMachineContractVersion, includeGatekeeper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTestCandyMachineRequest {\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    candyMachineContractVersion: ").append(toIndentedString(candyMachineContractVersion)).append("\n");
    sb.append("    includeGatekeeper: ").append(toIndentedString(includeGatekeeper)).append("\n");
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

