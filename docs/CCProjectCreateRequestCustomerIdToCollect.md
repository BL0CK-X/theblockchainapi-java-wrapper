

# CCProjectCreateRequestCustomerIdToCollect

The customer ID to collect during checkout. This could be a Twitter handle, a Telegram handle -- anything you use to identify your customers. We will collect it before they pay and link the payment to this ID. If you do not provide this, we will only be able to link the payment through either the customer's payment validation code, or their wallet's public key. If the users are signing in with their wallet in your application, then you can simply check whether they have paid through that. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idType** | [**IdTypeEnum**](#IdTypeEnum) | What type of identifier you are collecting, either an \&quot;email\&quot; or \&quot;misc\&quot;ellanous. Miscellanous simply means you are collecting something other than an email.   | 
**name** | **String** | The name of the customer ID input presented to the user  | 
**description** | **String** | The description / stated purpose of the customer ID input presented to the user  |  [optional]
**required** | **Boolean** | Whether to require the customer ID  |  [optional]



## Enum: IdTypeEnum

Name | Value
---- | -----
MISC | &quot;misc&quot;
EMAIL | &quot;email&quot;



