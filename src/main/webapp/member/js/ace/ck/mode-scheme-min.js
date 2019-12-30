ace.define("ace/mode/scheme",["require","exports","module","ace/lib/oop","ace/mode/text","ace/mode/scheme_highlight_rules"],function(e,t,n){var i=e("../lib/oop"),o=e("./text").Mode,r=e("./scheme_highlight_rules").SchemeHighlightRules,a=function(){this.HighlightRules=r};i.inherits(a,o),function(){this.lineCommentStart=";",this.$id="ace/mode/scheme"}.call(a.prototype),t.Mode=a}),ace.define("ace/mode/scheme_highlight_rules",["require","exports","module","ace/lib/oop","ace/mode/text_highlight_rules"],function(e,t,n){var i=e("../lib/oop"),o=e("./text_highlight_rules").TextHighlightRules,r=function(){var e="case|do|let|loop|if|else|when",t="eq?|eqv?|equal?|and|or|not|null?",n="#t|#f",i="cons|car|cdr|cond|lambda|lambda*|syntax-rules|format|set!|quote|eval|append|list|list?|member?|load",o=this.createKeywordMapper({"keyword.control":e,"keyword.operator":t,"constant.language":n,"support.function":i},"identifier",!0);this.$rules={start:[{token:"comment",regex:";.*$"},{token:["storage.type.function-type.scheme","text","entity.name.function.scheme"],regex:"(?:\\b(?:(define|define-syntax|define-macro))\\b)(\\s+)((?:\\w|\\-|\\!|\\?)*)"},{token:"punctuation.definition.constant.character.scheme",regex:"#:\\S+"},{token:["punctuation.definition.variable.scheme","variable.other.global.scheme","punctuation.definition.variable.scheme"],regex:"(\\*)(\\S*)(\\*)"},{token:"constant.numeric",regex:"#[xXoObB][0-9a-fA-F]+"},{token:"constant.numeric",regex:"[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?"},{token:o,regex:"[a-zA-Z_#][a-zA-Z0-9_\\-\\?\\!\\*]*"},{token:"string",regex:'"(?=.)',next:"qqstring"}],qqstring:[{token:"constant.character.escape.scheme",regex:"\\\\."},{token:"string",regex:'[^"\\\\]+',merge:!0},{token:"string",regex:"\\\\$",next:"qqstring",merge:!0},{token:"string",regex:'"|$',next:"start",merge:!0}]}};i.inherits(r,o),t.SchemeHighlightRules=r});