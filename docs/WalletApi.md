# WalletApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**derivePrivateKey**](WalletApi.md#derivePrivateKey) | **POST** /{blockchain}/wallet/private_key | Derive private key
[**deriveWalletIdentifier**](WalletApi.md#deriveWalletIdentifier) | **POST** /{blockchain}/wallet/identifier | Derive wallet identifier
[**generatePrivateKey**](WalletApi.md#generatePrivateKey) | **POST** /{blockchain}/wallet/generate/private_key | Generate private key
[**generateSeedPhrase**](WalletApi.md#generateSeedPhrase) | **POST** /{blockchain}/wallet/generate/secret_recovery_phrase | Generate seed phrase
[**getAirdrop**](WalletApi.md#getAirdrop) | **POST** /{blockchain}/wallet/airdrop | Get an airdrop
[**getBalance**](WalletApi.md#getBalance) | **POST** /{blockchain}/wallet/balance | Get wallet&#39;s balance of X
[**transfer**](WalletApi.md#transfer) | **POST** /{blockchain}/wallet/transfer | Transfer crypto, a token, or an NFT to another wallet


<a name="derivePrivateKey"></a>
# **derivePrivateKey**
> GeneralGeneratePrivateKeyResponse derivePrivateKey(blockchain, supplyWalletRequest)

Derive private key

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/derive-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely derive a private key for a wallet.   For example, if you have a seed phrase and want to derive the corresponding private key, use this endpoint.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "avalanche"; // String | The blockchain you want to use 
    SupplyWalletRequest supplyWalletRequest = new SupplyWalletRequest(); // SupplyWalletRequest | 
    try {
      GeneralGeneratePrivateKeyResponse result = apiInstance.derivePrivateKey(blockchain, supplyWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#derivePrivateKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: avalanche, binance_smart_chain, ethereum, near, solana]
 **supplyWalletRequest** | [**SupplyWalletRequest**](SupplyWalletRequest.md)|  |

### Return type

[**GeneralGeneratePrivateKeyResponse**](GeneralGeneratePrivateKeyResponse.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

<a name="deriveWalletIdentifier"></a>
# **deriveWalletIdentifier**
> WalletIdentifiers deriveWalletIdentifier(blockchain, supplyWalletRequest)

Derive wallet identifier

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/derive-wallet-identifier\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Derive the identifier for a wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "avalanche"; // String | The blockchain you want to use 
    SupplyWalletRequest supplyWalletRequest = new SupplyWalletRequest(); // SupplyWalletRequest | 
    try {
      WalletIdentifiers result = apiInstance.deriveWalletIdentifier(blockchain, supplyWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#deriveWalletIdentifier");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: avalanche, binance_smart_chain, ethereum, near, solana]
 **supplyWalletRequest** | [**SupplyWalletRequest**](SupplyWalletRequest.md)|  |

### Return type

[**WalletIdentifiers**](WalletIdentifiers.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

<a name="generatePrivateKey"></a>
# **generatePrivateKey**
> GeneralGeneratePrivateKeyResponse generatePrivateKey(blockchain)

Generate private key

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/generate-private-key\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a private key for a wallet.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "avalanche"; // String | The blockchain you want to use 
    try {
      GeneralGeneratePrivateKeyResponse result = apiInstance.generatePrivateKey(blockchain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#generatePrivateKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: avalanche, binance_smart_chain, ethereum, near, solana]

### Return type

[**GeneralGeneratePrivateKeyResponse**](GeneralGeneratePrivateKeyResponse.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

<a name="generateSeedPhrase"></a>
# **generateSeedPhrase**
> GeneralSecretPhrase generateSeedPhrase(blockchain, generateSeedPhraseRequest)

Generate seed phrase

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/generate-secret-phrase\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.  Use this endpoint to securely and randomly generate a seed phrase for a wallet.   &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "avalanche"; // String | The blockchain you want to use 
    GenerateSeedPhraseRequest generateSeedPhraseRequest = new GenerateSeedPhraseRequest(); // GenerateSeedPhraseRequest | 
    try {
      GeneralSecretPhrase result = apiInstance.generateSeedPhrase(blockchain, generateSeedPhraseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#generateSeedPhrase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: avalanche, binance_smart_chain, ethereum, near, solana]
 **generateSeedPhraseRequest** | [**GenerateSeedPhraseRequest**](GenerateSeedPhraseRequest.md)|  | [optional]

### Return type

[**GeneralSecretPhrase**](GeneralSecretPhrase.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

<a name="getAirdrop"></a>
# **getAirdrop**
> GeneralTransactionMadeResponse getAirdrop(blockchain, generalAirdropRequest)

Get an airdrop

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/get-airdrop\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      - Ethereum: Receive an airdrop of 0.001 ETH on Ropsten (not real ETH).  - Solana: Use this endpoint to get an airdrop of SOL on the devnet (not real SOL). Amount of 0.015, which is the minimum amount of SOL you need to mint an NFT and then transfer it to another wallet.  &#x60;Cost: 0 Credit&#x60; (Free) (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "ethereum"; // String | The blockchain you want to use 
    GeneralAirdropRequest generalAirdropRequest = new GeneralAirdropRequest(); // GeneralAirdropRequest | 
    try {
      GeneralTransactionMadeResponse result = apiInstance.getAirdrop(blockchain, generalAirdropRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getAirdrop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: ethereum, solana]
 **generalAirdropRequest** | [**GeneralAirdropRequest**](GeneralAirdropRequest.md)|  | [optional]

### Return type

[**GeneralTransactionMadeResponse**](GeneralTransactionMadeResponse.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

<a name="getBalance"></a>
# **getBalance**
> GeneralBalanceResponse getBalance(blockchain, generalBalanceRequest)

Get wallet&#39;s balance of X

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/get-wallet-balance\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      See the balance of a wallet in the native blockchain currency (e.g., ETH, SOL) or any token (e.g., ERC-20, NFTs, SPL, etc.).  To get the balance of a specific token, supply the &#x60;token_blockchain_identifier&#x60; of the token.   You can also use this endpoint to see whether or not a person owns an NFT. Just supply the &#x60;token_blockchain_identifier&#x60; of the NFT. A balance of \&quot;1\&quot; means the person owns the NFT, and a balance of \&quot;0\&quot; means the person does not own the NFT.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "ethereum"; // String | The blockchain you want to use 
    GeneralBalanceRequest generalBalanceRequest = new GeneralBalanceRequest(); // GeneralBalanceRequest | 
    try {
      GeneralBalanceResponse result = apiInstance.getBalance(blockchain, generalBalanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: ethereum, solana]
 **generalBalanceRequest** | [**GeneralBalanceRequest**](GeneralBalanceRequest.md)|  | [optional]

### Return type

[**GeneralBalanceResponse**](GeneralBalanceResponse.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

<a name="transfer"></a>
# **transfer**
> GeneralTransactionResponse transfer(blockchain, generalTransferRequest)

Transfer crypto, a token, or an NFT to another wallet

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/transfer-crypto-token-or-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer ETH/SOL/crypto example (Python, JavaScript)&lt;/a&gt;.  &lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/wallet/transfer-crypto-token-or-nft\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See transfer NFT/token example (Python, JavaScript)&lt;/a&gt;.  This is a powerful function. It might be slightly confusing because there are several optional parameters, so take some time to review it.   This function can send - The native currency of the selected blockchain (e.g., SOL, ETH, BNB, etc.) - A token (e.g., an SPL token, ERC-20 token, etc.) - An NFT  You can sign and submit the transaction for confirmation; and you can select to simply return the compiled transaction so that you can submit it to the user for signing (e.g., via Phantom or Metamask; no private keys required in this case).  If you&#39;re transferring an NFT or a token, supply its respective &#x60;token_blockchain_identifier&#x60;.  SENDER: Note that the wallet information is used to authorize the sending of the tokens and identifies the source of the tokens. If &#x60;return_compiled_transaction &#x3D; false&#x60;, we sign and submit the transaction (&#x60;wallet&#x60; is required in this case; do not provide a value for &#x60;sender_blockchain_identifier&#x60;). If &#x60;return_compiled_transaction &#x3D; true&#x60;, we compile the transaction (&#x60;sender_blockchain_identifier&#x60; is required in this case; do not provide &#x60;wallet&#x60;).  RECIPIENT: &#x60;recipient_blockchain_identifier&#x60; identifies the receiver. This is entirely separate from the information used for the SENDER above. So, in this API call, there are two wallets involved, but only one (namely, the SENDER) is needed to authorize the transaction (if you want us to sign and submitting it).  FEE_PAYER (Solana only): The fee payer of the transaction defaults to &#x60;wallet&#x60; (or &#x60;sender_blockchain_identifier&#x60;). To set a different fee payer, provide a value for &#x60;fee_payer_wallet&#x60;.  &#x60;Cost: 2 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.blockchainapi.com/v1");
    
    // Configure API key authorization: APIKeyID
    ApiKeyAuth APIKeyID = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyID");
    APIKeyID.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyID.setApiKeyPrefix("Token");

    // Configure API key authorization: APISecretKey
    ApiKeyAuth APISecretKey = (ApiKeyAuth) defaultClient.getAuthentication("APISecretKey");
    APISecretKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APISecretKey.setApiKeyPrefix("Token");

    WalletApi apiInstance = new WalletApi(defaultClient);
    String blockchain = "ethereum"; // String | The blockchain you want to use 
    GeneralTransferRequest generalTransferRequest = new GeneralTransferRequest(); // GeneralTransferRequest | 
    try {
      GeneralTransactionResponse result = apiInstance.transfer(blockchain, generalTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#transfer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchain** | **String**| The blockchain you want to use  | [enum: ethereum, solana]
 **generalTransferRequest** | [**GeneralTransferRequest**](GeneralTransferRequest.md)|  | [optional]

### Return type

[**GeneralTransactionResponse**](GeneralTransactionResponse.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**400** | Bad request (check response message) |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |

