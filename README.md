
# cljs-file-saver

### Overview

The <strong>cljs-file-saver</strong> is a simple ClojureScript tool for saving
files to the user's device.

### deps.edn

```
{:deps {bithandshake/cljs-file-saver {:git/url "https://github.com/bithandshake/cljs-file-saver"
                                      :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/bithandshake/cljs-file-saver/tree/release).

### Documentation

The <strong>cljs-file-saver</strong> functional documentation is [available here](https://bithandshake.github.io/cljs-file-saver).

### Changelog

You can track the changes of the <strong>cljs-file-saver</strong> library [here](CHANGES.md).

# Usage

> Some parameters of the following functions and some further functions are not discussed in this file.
  To learn more about the available functionality, check out the [functional documentation](documentation/COVER.md)!

### Index

- [How to save a file to the user's device?](#how-to-save-a-to-the-users-device)

### How to save a file to the user's device?

The [`file-saver.api/save-file!`](documentation/cljs/file-saver/API.md#save-file)
function saves a file to the user's device. The origin of data could be a data URL
or an URI.

```
(def my-data-url (str "data:text/plain;charset=utf-8,My text"))

(save-file! {:data-url my-data-url :filename "My file.txt"}])
```

```
(save-file! {:uri "/images/my-image.jpg" :filename "my-image.jpg"})

```
