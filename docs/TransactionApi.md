# TransactionApi

All URIs are relative to *https://api.blockchainapi.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransaction**](TransactionApi.md#getTransaction) | **GET** /{blockchain}/transaction/{network}/{transaction_blockchain_identifier} | Get the details of a transaction made on a blockchain


<a name="getTransaction"></a>
# **getTransaction**
> GeneralTransaction getTransaction(blockchain, network, transactionBlockchainIdentifier)

Get the details of a transaction made on a blockchain

&lt;a href&#x3D;\&quot;https://github.com/BL0CK-X/blockchain-api/tree/main/examples/transaction/get-transaction\&quot; target&#x3D;\&quot;_blank\&quot;&gt;See examples (Python, JavaScript)&lt;/a&gt;.      Get the details of a transaction made on the specified blockchain.  &#x60;Cost: 0.25 Credit&#x60; (&lt;a href&#x3D;\&quot;#section/Pricing\&quot;&gt;See Pricing&lt;/a&gt;)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

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

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String blockchain = "ethereum"; // String | The blockchain you want to use 
    String network = "ropsten"; // String | The network of the blockchain you selected  - Solana: `devnet`, `mainnet-beta` - Ethereum: `ropsten`, `mainnet`  Defaults when not provided (not applicable to path parameters): - Solana: `devnet` - Ethereum: `ropsten`
    String transactionBlockchainIdentifier = "0x5f36b787daa57bfe8568d69e24eae54ccb00720c6edfc826bd4a7b19c525eef4"; // String | The transaction signature of the transaction.  Examples: - Solana: `5wHu1qwD7q5ifaN5nwdcDqNFo53GJqa7nLp2BeeEpcHCusb4GzARz4GjgzsEHMkBMgCJMGa6GSQ1VG96Exv8kt2W` - Ethereum: `0x5f36b787daa57bfe8568d69e24eae54ccb00720c6edfc826bd4a7b19c525eef4`
    try {
      GeneralTransaction result = apiInstance.getTransaction(blockchain, network, transactionBlockchainIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getTransaction");
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
 **network** | **String**| The network of the blockchain you selected  - Solana: &#x60;devnet&#x60;, &#x60;mainnet-beta&#x60; - Ethereum: &#x60;ropsten&#x60;, &#x60;mainnet&#x60;  Defaults when not provided (not applicable to path parameters): - Solana: &#x60;devnet&#x60; - Ethereum: &#x60;ropsten&#x60; |
 **transactionBlockchainIdentifier** | **String**| The transaction signature of the transaction.  Examples: - Solana: &#x60;5wHu1qwD7q5ifaN5nwdcDqNFo53GJqa7nLp2BeeEpcHCusb4GzARz4GjgzsEHMkBMgCJMGa6GSQ1VG96Exv8kt2W&#x60; - Ethereum: &#x60;0x5f36b787daa57bfe8568d69e24eae54ccb00720c6edfc826bd4a7b19c525eef4&#x60; |

### Return type

[**GeneralTransaction**](GeneralTransaction.md)

### Authorization

[APIKeyID](../README.md#APIKeyID), [APISecretKey](../README.md#APISecretKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transaction found. Details in response. Click \&quot;Expand All\&quot; in the documentation sidebar to the right to view an example. |  -  |
**400** | Invalid input or issue retrieving transaction. See response for details |  -  |
**401** | Invalid API key pair in headers |  -  |
**402** | Payment required. Occurs when you run out of API requests. Upgrade &lt;a href&#x3D;\&quot;https://dashboard.theblockchainapi.com/billing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. |  -  |
**404** | Task not found. |  -  |

