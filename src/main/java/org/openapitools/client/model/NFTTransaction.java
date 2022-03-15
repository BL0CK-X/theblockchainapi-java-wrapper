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

/**
 * NFTTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T12:06:18.396945-07:00[America/Los_Angeles]")
public class NFTTransaction {
  public static final String SERIALIZED_NAME_BLOCK_TIME = "block_time";
  @SerializedName(SERIALIZED_NAME_BLOCK_TIME)
  private BigDecimal blockTime;

  /**
   * The NFT exchange on which the transaction occurred
   */
  @JsonAdapter(ExchangeEnum.Adapter.class)
  public enum ExchangeEnum {
    SOLSEA("solsea"),
    
    MAGIC_EDEN("magic-eden"),
    
    ALPHA_ART("alpha-art"),
    
    DIGITAL_EYES("digital-eyes"),
    
    SOLANART("solanart"),
    
    EXCHANGE_ART("exchange-art");

    private String value;

    ExchangeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExchangeEnum fromValue(String value) {
      for (ExchangeEnum b : ExchangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExchangeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExchangeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExchangeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExchangeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXCHANGE = "exchange";
  @SerializedName(SERIALIZED_NAME_EXCHANGE)
  private ExchangeEnum exchange;

  /**
   * A readable version of the NFT exchange
   */
  @JsonAdapter(ExchangeReadableEnum.Adapter.class)
  public enum ExchangeReadableEnum {
    SOLSEA("SolSea"),
    
    MAGIC_EDEN("Magic Eden"),
    
    ALPHA_ART("Alpha Art"),
    
    DIGITAL_EYES("Digital Eyes"),
    
    SOLANART("Solanart"),
    
    EXCHANGE_ART("Exchange.art");

    private String value;

    ExchangeReadableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExchangeReadableEnum fromValue(String value) {
      for (ExchangeReadableEnum b : ExchangeReadableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExchangeReadableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExchangeReadableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExchangeReadableEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExchangeReadableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXCHANGE_READABLE = "exchange_readable";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_READABLE)
  private ExchangeReadableEnum exchangeReadable;

  public static final String SERIALIZED_NAME_MINT_ADDRESS = "mint_address";
  @SerializedName(SERIALIZED_NAME_MINT_ADDRESS)
  private String mintAddress;

  /**
   * The operation of the transaction
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    BUY("buy"),
    
    LIST("list"),
    
    DE_LIST("de_list"),
    
    UPDATE_LISTING("update_listing");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private String seller;

  public static final String SERIALIZED_NAME_BUYER = "buyer";
  @SerializedName(SERIALIZED_NAME_BUYER)
  private String buyer;

  public static final String SERIALIZED_NAME_TRANSACTION_SIGNATURE = "transaction_signature";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SIGNATURE)
  private String transactionSignature;


  public NFTTransaction blockTime(BigDecimal blockTime) {
    
    this.blockTime = blockTime;
    return this;
  }

   /**
   * An epoch time stamp in UTC time that represents the time of the block where the transaction was processed 
   * @return blockTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1644371872", value = "An epoch time stamp in UTC time that represents the time of the block where the transaction was processed ")

  public BigDecimal getBlockTime() {
    return blockTime;
  }


  public void setBlockTime(BigDecimal blockTime) {
    this.blockTime = blockTime;
  }


  public NFTTransaction exchange(ExchangeEnum exchange) {
    
    this.exchange = exchange;
    return this;
  }

   /**
   * The NFT exchange on which the transaction occurred
   * @return exchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "magic-eden", value = "The NFT exchange on which the transaction occurred")

  public ExchangeEnum getExchange() {
    return exchange;
  }


  public void setExchange(ExchangeEnum exchange) {
    this.exchange = exchange;
  }


  public NFTTransaction exchangeReadable(ExchangeReadableEnum exchangeReadable) {
    
    this.exchangeReadable = exchangeReadable;
    return this;
  }

   /**
   * A readable version of the NFT exchange
   * @return exchangeReadable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "magic-eden", value = "A readable version of the NFT exchange")

  public ExchangeReadableEnum getExchangeReadable() {
    return exchangeReadable;
  }


  public void setExchangeReadable(ExchangeReadableEnum exchangeReadable) {
    this.exchangeReadable = exchangeReadable;
  }


  public NFTTransaction mintAddress(String mintAddress) {
    
    this.mintAddress = mintAddress;
    return this;
  }

   /**
   * The mint address of the NFT 
   * @return mintAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mint address of the NFT ")

  public String getMintAddress() {
    return mintAddress;
  }


  public void setMintAddress(String mintAddress) {
    this.mintAddress = mintAddress;
  }


  public NFTTransaction operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The operation of the transaction
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "list", value = "The operation of the transaction")

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public NFTTransaction seller(String seller) {
    
    this.seller = seller;
    return this;
  }

   /**
   * The public key of the wallet that listed the NFT
   * @return seller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EmioriB6Y5nLaz1NzQTZu1T5XxJjBVHAxy6SsX9wzWTw", value = "The public key of the wallet that listed the NFT")

  public String getSeller() {
    return seller;
  }


  public void setSeller(String seller) {
    this.seller = seller;
  }


  public NFTTransaction buyer(String buyer) {
    
    this.buyer = buyer;
    return this;
  }

   /**
   * The public key of the buyer. This only exists in &#x60;buy&#x60; transactions. 
   * @return buyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5tCqPe7XNWSNy8aNLbBcqaf5i28RuEH8onsCHsUsvYmn", value = "The public key of the buyer. This only exists in `buy` transactions. ")

  public String getBuyer() {
    return buyer;
  }


  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }


  public NFTTransaction transactionSignature(String transactionSignature) {
    
    this.transactionSignature = transactionSignature;
    return this;
  }

   /**
   * The signature of the transaction. You can look up each transaction on explorer.solana.com 
   * @return transactionSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3EGfHHwxv935ULG3RXsj3PjHyJpMG1adzCQMs7ApgkMpfyyTFbpVzVnjMMBhFG2g15jrafDtVuiiTfR9Poc5mDfw", value = "The signature of the transaction. You can look up each transaction on explorer.solana.com ")

  public String getTransactionSignature() {
    return transactionSignature;
  }


  public void setTransactionSignature(String transactionSignature) {
    this.transactionSignature = transactionSignature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFTTransaction nfTTransaction = (NFTTransaction) o;
    return Objects.equals(this.blockTime, nfTTransaction.blockTime) &&
        Objects.equals(this.exchange, nfTTransaction.exchange) &&
        Objects.equals(this.exchangeReadable, nfTTransaction.exchangeReadable) &&
        Objects.equals(this.mintAddress, nfTTransaction.mintAddress) &&
        Objects.equals(this.operation, nfTTransaction.operation) &&
        Objects.equals(this.seller, nfTTransaction.seller) &&
        Objects.equals(this.buyer, nfTTransaction.buyer) &&
        Objects.equals(this.transactionSignature, nfTTransaction.transactionSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockTime, exchange, exchangeReadable, mintAddress, operation, seller, buyer, transactionSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTTransaction {\n");
    sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeReadable: ").append(toIndentedString(exchangeReadable)).append("\n");
    sb.append("    mintAddress: ").append(toIndentedString(mintAddress)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    transactionSignature: ").append(toIndentedString(transactionSignature)).append("\n");
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

