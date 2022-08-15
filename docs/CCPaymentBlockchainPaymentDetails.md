

# CCPaymentBlockchainPaymentDetails

The information necessary to verify the payment.  

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chain** | [**ChainEnum**](#ChainEnum) | The chain on which the payment was made.  |  [optional]
**feeAmount** | **String** | The fee taken by the blockchain API. This is shown in integer form.  |  [optional]
**payoutAmount** | **String** | The amount paid to the project&#39;s payout wallet (the recipient of the payment). This is shown in integer form.  |  [optional]
**tokenBlockchainIdentifier** | **String** | The blockchain identifier of the token used to pay. Currently, we only support payments in USDC.  |  [optional]
**totalPaid** | **String** | The total paid by the user when making the payment. This should match the amount set in the respective plan.  |  [optional]
**transactionSignature** | **String** | The transaction signature which you can use to manually or automatically verify the transaction on the blockchain.  |  [optional]



## Enum: ChainEnum

Name | Value
---- | -----
SOLANA | &quot;solana&quot;



