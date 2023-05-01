
# file-saver.api ClojureScript namespace

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > file-saver.api

### Index

- [save-file!](#save-file)

### save-file!

```
@param (map) options
{:data-url (string)(opt)
 :filename (string)(opt)
  Default: "untitled.txt"
 :uri (string)(opt)}
```

```
@usage
(save-file! {:data-url "data:text/plain;charset=utf-8,..."}
             :filename "my-file.edn"})
```

```
@usage
(save-file! {:uri      "/images/my-image.jpg"}
             :filename "my-image.jpg"})
```

<details>
<summary>Source code</summary>

```
(defn save-file!
  [options]
  (letfn [(f [] (-> "file-saver" dom/get-element-by-id .click))]
         (temporary-component/append-component! [views/file-saver options] f)
         (temporary-component/remove-component!)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [file-saver.api :refer [save-file!]]))

(file-saver.api/save-file! ...)
(save-file!                ...)
```

</details>

---

This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.

