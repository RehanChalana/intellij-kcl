// This is a generated file. Not intended for manual editing.
package io.kusionstack.kcl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.kusionstack.kcl.psi.KCLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.kusionstack.kcl.psi.*;

public class KCLSimpleAssignStmtImpl extends ASTWrapperPsiElement implements KCLSimpleAssignStmt {

  public KCLSimpleAssignStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KCLVisitor visitor) {
    visitor.visitSimpleAssignStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KCLVisitor) accept((KCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KCLIdentifier getIdentifier() {
    return findNotNullChildByClass(KCLIdentifier.class);
  }

  @Override
  @NotNull
  public KCLTest getTest() {
    return findNotNullChildByClass(KCLTest.class);
  }

}
