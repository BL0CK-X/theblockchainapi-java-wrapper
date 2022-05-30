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
 * GetNFTListingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T09:58:36.085380-07:00[America/Los_Angeles]")
public class GetNFTListingResponse {
  /**
   * The ID of the exchange where the NFT is listed 
   */
  @JsonAdapter(ExchangeEnum.Adapter.class)
  public enum ExchangeEnum {
    SOLSEA("solsea");

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

  public static final String SERIALIZED_NAME_EXCHANGE_READABLE = "exchange_readable";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_READABLE)
  private String exchangeReadable;

  public static final String SERIALIZED_NAME_LISTING_TRANSACTION_SIGNATURE = "listing_transaction_signature";
  @SerializedName(SERIALIZED_NAME_LISTING_TRANSACTION_SIGNATURE)
  private String listingTransactionSignature;

  public static final String SERIALIZED_NAME_MINT_ADDRESS = "mint_address";
  @SerializedName(SERIALIZED_NAME_MINT_ADDRESS)
  private String mintAddress;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private String seller;

  public GetNFTListingResponse() { 
  }

  public GetNFTListingResponse exchange(ExchangeEnum exchange) {
    
    this.exchange = exchange;
    return this;
  }

   /**
   * The ID of the exchange where the NFT is listed 
   * @return exchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the exchange where the NFT is listed ")

  public ExchangeEnum getExchange() {
    return exchange;
  }


  public void setExchange(ExchangeEnum exchange) {
    this.exchange = exchange;
  }


  public GetNFTListingResponse exchangeReadable(String exchangeReadable) {
    
    this.exchangeReadable = exchangeReadable;
    return this;
  }

   /**
   * A readable version of the exchange ID 
   * @return exchangeReadable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A readable version of the exchange ID ")

  public String getExchangeReadable() {
    return exchangeReadable;
  }


  public void setExchangeReadable(String exchangeReadable) {
    this.exchangeReadable = exchangeReadable;
  }


  public GetNFTListingResponse listingTransactionSignature(String listingTransactionSignature) {
    
    this.listingTransactionSignature = listingTransactionSignature;
    return this;
  }

   /**
   * The signature of the listing transaction 
   * @return listingTransactionSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The signature of the listing transaction ")

  public String getListingTransactionSignature() {
    return listingTransactionSignature;
  }


  public void setListingTransactionSignature(String listingTransactionSignature) {
    this.listingTransactionSignature = listingTransactionSignature;
  }


  public GetNFTListingResponse mintAddress(String mintAddress) {
    
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


  public GetNFTListingResponse price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the NFT in Lamports. Represented as an integer.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price of the NFT in Lamports. Represented as an integer.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public GetNFTListingResponse seller(String seller) {
    
    this.seller = seller;
    return this;
  }

   /**
   * The public key of the seller
   * @return seller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public key of the seller")

  public String getSeller() {
    return seller;
  }


  public void setSeller(String seller) {
    this.seller = seller;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNFTListingResponse getNFTListingResponse = (GetNFTListingResponse) o;
    return Objects.equals(this.exchange, getNFTListingResponse.exchange) &&
        Objects.equals(this.exchangeReadable, getNFTListingResponse.exchangeReadable) &&
        Objects.equals(this.listingTransactionSignature, getNFTListingResponse.listingTransactionSignature) &&
        Objects.equals(this.mintAddress, getNFTListingResponse.mintAddress) &&
        Objects.equals(this.price, getNFTListingResponse.price) &&
        Objects.equals(this.seller, getNFTListingResponse.seller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, exchangeReadable, listingTransactionSignature, mintAddress, price, seller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNFTListingResponse {\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeReadable: ").append(toIndentedString(exchangeReadable)).append("\n");
    sb.append("    listingTransactionSignature: ").append(toIndentedString(listingTransactionSignature)).append("\n");
    sb.append("    mintAddress: ").append(toIndentedString(mintAddress)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
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

