### Solaris Wallet Protocol


The Solaris Server is derived from the bitcoin electrum server.

Each request has its own server-side response, including subscription requests.

Initialization flow:

  Client                                      Server

    |   server.version                          |
    |   ----------------------------------->    |
    |                  server.version response  |
    |   <-----------------------------------    |
    |                                           |
    |   blockchain.address.subscribe            |
    |    ----------------------------------->   |
    |    blockchain.address.subscribe response  |
    |   <-----------------------------------    |
    |          address subscribe notification   |
    |   <-----------------------------------    |
    |                                           |

First the version is sent to verify that the server is running a version accepted by the client.


server.version
==============

Identifies the client to the server.

  server.version(**client_name**, **protocol_version**)

  **client_name**

    An optional string identifying the connecting client software.

  **protocol_verion**

    Optional.  The rate passed is ignored.

**Response**

  A string identifying the server software.

**Example**::

  server.version("2.7.11", "1.0")


Step two is to send the subscription to known addresses, the addresses known by the client that were delivered to the user are sent.
The server sends notifications when said address changes state.

blockchain.address.subscribe
============================

Subscribe to a Solaris address.

  blockchain.address.subscribe(**address**)

  **address**

    The address as a Base58 string.

**Response**

  The *status* [1]_ of the address.

**Notifications**

  As this is a subcription, the client will receive a notification
  when the status of the address changes.  The parameters are:

    [**address**, **status**]

.. [1] To calculate the *status* of an address, order confirmed
       transactions touching the address by height (and position in
       the block if there are more than one in a block).  Form a
       string that is the concatenation of strings 'tx_hash:height:'
       for each transaction in order.  *tx_hash* is the transaction
       hash in hexadecimal, *height* the height of the block it is in.
       Next, with mempool transactions in any order, append a string
       that is the same, but where *height* is `-1` if the transaction
       has at least one unconfirmed unspent, and `0` if all inputs are
       confirmed.  The *status* is the **sha256** hash of this string
       expressed as a hexadecimal string.

