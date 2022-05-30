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
import org.openapitools.client.model.FeePayerWallet;
import org.openapitools.client.model.Wallet;

/**
 * TransferRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-30T09:58:36.085380-07:00[America/Los_Angeles]")
public class TransferRequest {
  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipient_address";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private String recipientAddress;

  public static final String SERIALIZED_NAME_WALLET = "wallet";
  @SerializedName(SERIALIZED_NAME_WALLET)
  private Wallet wallet;

  public static final String SERIALIZED_NAME_TOKEN_ADDRESS = "token_address";
  @SerializedName(SERIALIZED_NAME_TOKEN_ADDRESS)
  private String tokenAddress;

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount = "1";

  public static final String SERIALIZED_NAME_RETURN_COMPILED_TRANSACTION = "return_compiled_transaction";
  @SerializedName(SERIALIZED_NAME_RETURN_COMPILED_TRANSACTION)
  private Boolean returnCompiledTransaction = false;

  public static final String SERIALIZED_NAME_SENDER_PUBLIC_KEY = "sender_public_key";
  @SerializedName(SERIALIZED_NAME_SENDER_PUBLIC_KEY)
  private String senderPublicKey = "null";

  public static final String SERIALIZED_NAME_FEE_PAYER_WALLET = "fee_payer_wallet";
  @SerializedName(SERIALIZED_NAME_FEE_PAYER_WALLET)
  private FeePayerWallet feePayerWallet;

  public TransferRequest() { 
  }

  public TransferRequest recipientAddress(String recipientAddress) {
    
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * The public key address of the recipient to whom you want to send a token or NFT
   * @return recipientAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The public key address of the recipient to whom you want to send a token or NFT")

  public String getRecipientAddress() {
    return recipientAddress;
  }


  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }


  public TransferRequest wallet(Wallet wallet) {
    
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


  public TransferRequest tokenAddress(String tokenAddress) {
    
    this.tokenAddress = tokenAddress;
    return this;
  }

   /**
   * If you&#39;re transfering an NFT, supply the &#x60;mint&#x60; (the address of the mint) for the &#x60;token_address&#x60;. If you&#39;re transfering a token, supply the token address found on the explorer (e.g., see &#x60;SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt&#x60; for &lt;a href&#x3D;\&quot;https://explorer.solana.com/address/SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Serum Token&lt;/a&gt;) for the &#x60;token_address&#x60;. If you&#39;re transferring SOL, do not supply a value for &#x60;token_address&#x60;. 
   * @return tokenAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If you're transfering an NFT, supply the `mint` (the address of the mint) for the `token_address`. If you're transfering a token, supply the token address found on the explorer (e.g., see `SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt` for <a href=\"https://explorer.solana.com/address/SRMuApVNdxXokk5GT7XD5cUUgXMBCoAz2LHeuAoKWRt\" target=\"_blank\">Serum Token</a>) for the `token_address`. If you're transferring SOL, do not supply a value for `token_address`. ")

  public String getTokenAddress() {
    return tokenAddress;
  }


  public void setTokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
  }


  public TransferRequest network(NetworkEnum network) {
    
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


  public TransferRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * This value must be a string. What you provide here depends on if you are sending an NFT, an SPL token, or SOL.  - NFT: This must be &#39;1&#39;. - SPL Token: This must be an integer in string format. To convert from what you see on a wallet UI (e.g., 1 ATLAS, 1 USDC) to an integer value, you have to multiply that value by 10^&lt;i&gt;x&lt;/i&gt; where &lt;i&gt;x&lt;/i&gt; is the number of decimals. For example, to transfer 0.2 USDC, if USDC uses 6 decimals, then the amount is 0.2 * 10^6 &#x3D; 200000. You can get the number of decimals for a given SPL token &lt;a href&#x3D;\&quot;#operation/solanaGetSPLToken\&quot;&gt;here&lt;/a&gt;. - SOL: Supply this value denominated in SOL in a string format. This does not need to be an integer. For example, if you want to send 0.0005 SOL, then amount &#x3D; \&quot;0.0005\&quot;.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This value must be a string. What you provide here depends on if you are sending an NFT, an SPL token, or SOL.  - NFT: This must be '1'. - SPL Token: This must be an integer in string format. To convert from what you see on a wallet UI (e.g., 1 ATLAS, 1 USDC) to an integer value, you have to multiply that value by 10^<i>x</i> where <i>x</i> is the number of decimals. For example, to transfer 0.2 USDC, if USDC uses 6 decimals, then the amount is 0.2 * 10^6 = 200000. You can get the number of decimals for a given SPL token <a href=\"#operation/solanaGetSPLToken\">here</a>. - SOL: Supply this value denominated in SOL in a string format. This does not need to be an integer. For example, if you want to send 0.0005 SOL, then amount = \"0.0005\".")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferRequest returnCompiledTransaction(Boolean returnCompiledTransaction) {
    
    this.returnCompiledTransaction = returnCompiledTransaction;
    return this;
  }

   /**
   * If &#x60;false&#x60;, we sign and submit the transaction (&#x60;wallet&#x60; is required in this case; do not provide a value for &#x60;sender_public_key&#x60;).  If &#x60;true&#x60;, we compile the transaction (either &#x60;wallet&#x60; or &#x60;sender_public_key&#x60; is required in this case; do not provide both). 
   * @return returnCompiledTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `false`, we sign and submit the transaction (`wallet` is required in this case; do not provide a value for `sender_public_key`).  If `true`, we compile the transaction (either `wallet` or `sender_public_key` is required in this case; do not provide both). ")

  public Boolean getReturnCompiledTransaction() {
    return returnCompiledTransaction;
  }


  public void setReturnCompiledTransaction(Boolean returnCompiledTransaction) {
    this.returnCompiledTransaction = returnCompiledTransaction;
  }


  public TransferRequest senderPublicKey(String senderPublicKey) {
    
    this.senderPublicKey = senderPublicKey;
    return this;
  }

   /**
   * To understand the purpose of &#x60;sender_public_key&#x60; first note the following: There are two ways you can complete a transfer transaction: (1) we complete it for you with your &#x60;wallet&#x60; information or (2) we return the raw instruction data that you can sign and submit yourself (no private keys required). When you provide your &#x60;wallet&#x60; authentication, we are able to determine your wallet&#39;s public key, which is the sender public key of the transaction. When you are not providing your &#x60;wallet&#x60; as authentication, we still need the &#x60;sender_public_key&#x60; to be able to return the compiled transaction. Thus, you provide &#x60;sender_public_key&#x60; only if you are not providing &#x60;wallet&#x60; authentication information and you are returning a compiled transaction. You will receive an error if you provide both &#x60;wallet&#x60; and &#x60;sender_public_key&#x60;. You will receive an error if you provide neither &#x60;wallet&#x60; nor &#x60;sender_public_key&#x60;. 
   * @return senderPublicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To understand the purpose of `sender_public_key` first note the following: There are two ways you can complete a transfer transaction: (1) we complete it for you with your `wallet` information or (2) we return the raw instruction data that you can sign and submit yourself (no private keys required). When you provide your `wallet` authentication, we are able to determine your wallet's public key, which is the sender public key of the transaction. When you are not providing your `wallet` as authentication, we still need the `sender_public_key` to be able to return the compiled transaction. Thus, you provide `sender_public_key` only if you are not providing `wallet` authentication information and you are returning a compiled transaction. You will receive an error if you provide both `wallet` and `sender_public_key`. You will receive an error if you provide neither `wallet` nor `sender_public_key`. ")

  public String getSenderPublicKey() {
    return senderPublicKey;
  }


  public void setSenderPublicKey(String senderPublicKey) {
    this.senderPublicKey = senderPublicKey;
  }


  public TransferRequest feePayerWallet(FeePayerWallet feePayerWallet) {
    
    this.feePayerWallet = feePayerWallet;
    return this;
  }

   /**
   * Get feePayerWallet
   * @return feePayerWallet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeePayerWallet getFeePayerWallet() {
    return feePayerWallet;
  }


  public void setFeePayerWallet(FeePayerWallet feePayerWallet) {
    this.feePayerWallet = feePayerWallet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequest transferRequest = (TransferRequest) o;
    return Objects.equals(this.recipientAddress, transferRequest.recipientAddress) &&
        Objects.equals(this.wallet, transferRequest.wallet) &&
        Objects.equals(this.tokenAddress, transferRequest.tokenAddress) &&
        Objects.equals(this.network, transferRequest.network) &&
        Objects.equals(this.amount, transferRequest.amount) &&
        Objects.equals(this.returnCompiledTransaction, transferRequest.returnCompiledTransaction) &&
        Objects.equals(this.senderPublicKey, transferRequest.senderPublicKey) &&
        Objects.equals(this.feePayerWallet, transferRequest.feePayerWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientAddress, wallet, tokenAddress, network, amount, returnCompiledTransaction, senderPublicKey, feePayerWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequest {\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    tokenAddress: ").append(toIndentedString(tokenAddress)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    returnCompiledTransaction: ").append(toIndentedString(returnCompiledTransaction)).append("\n");
    sb.append("    senderPublicKey: ").append(toIndentedString(senderPublicKey)).append("\n");
    sb.append("    feePayerWallet: ").append(toIndentedString(feePayerWallet)).append("\n");
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

